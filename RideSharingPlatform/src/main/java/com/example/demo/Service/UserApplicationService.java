package com.example.demo.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.DrivingLicenceDTO;
import com.example.demo.DTO.UserApplicationsDTO;
import com.example.demo.Repository.DrivingLicenceRepository;
import com.example.demo.Repository.UserApplicationRepository;
import com.example.demo.entity.DrivingLicence;
import com.example.demo.entity.UserApplications;



@Service
public class UserApplicationService {

	
	@Autowired
	private UserApplicationRepository applicationsRepository;
	
	
	@Autowired
	private DrivingLicenceRepository drivingLicenceRepository;
	
	// Email validation regex pattern
	private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
	private static final Pattern emailPattern = Pattern.compile(EMAIL_PATTERN);
	
	// Phone number validation pattern (10 digits)
	private static final String PHONE_PATTERN = "^[0-9]{10}$";
	private static final Pattern phonePattern = Pattern.compile(PHONE_PATTERN);
	
	
	public void createUser(UserApplications userApplication) {
		try {
			// Null validation
			if(userApplication == null) {
				throw new IllegalArgumentException("User application object cannot be null.");
			}
			
			// Required field validation
			if(userApplication.getUserName() == null || userApplication.getUserName().trim().isEmpty()) {
				throw new IllegalArgumentException("User name is required and cannot be empty.");
			}
			
			if(userApplication.getEmail() == null || userApplication.getEmail().trim().isEmpty()) {
				throw new IllegalArgumentException("Email is required and cannot be empty.");
			}
			
			if(userApplication.getPhoneNo() == null || userApplication.getPhoneNo().trim().isEmpty()) {
				throw new IllegalArgumentException("Phone number is required and cannot be empty.");
			}
			
			if(userApplication.getRole() == null || userApplication.getRole().trim().isEmpty()) {
				throw new IllegalArgumentException("Role is required and cannot be empty.");
			}
			
			// Email format validation
			if(!isValidEmail(userApplication.getEmail())) {
				throw new IllegalArgumentException("Invalid email format: " + userApplication.getEmail());
			}
			
			// Phone number validation
			if(!isValidPhoneNumber(userApplication.getPhoneNo())) {
				throw new IllegalArgumentException("Phone number must be exactly 10 digits: " + userApplication.getPhoneNo());
			}
			
			// Role-based validation
			String role = userApplication.getRole().trim();
			if(role.equalsIgnoreCase("Motorist")) {
				DrivingLicence drivingLicence = userApplication.getDrivingLicence();
				if(drivingLicence == null) {
					throw new IllegalArgumentException("Driving licence is required for Motorist role.");
				}
				
				// Validate driving licence fields
				if(drivingLicence.getLicenceNo() == null || drivingLicence.getLicenceNo().trim().isEmpty()) {
					throw new IllegalArgumentException("Licence number is required for driving licence.");
				}
				
							if(drivingLicence.getExpirationDate() == null) {
								throw new IllegalArgumentException("Expiration date is required for driving licence.");
							}
							// Expiration date should not be in the past
							if(drivingLicence.getExpirationDate().isBefore(LocalDate.now())) {
								throw new IllegalArgumentException("Driving licence expiration date must not be in the past.");
							}
			}
			
			// Save user application
			try {
				applicationsRepository.save(userApplication);
			} catch (Exception e) {
				throw new RuntimeException("Error saving user application to database: " + e.getMessage(), e);
			}
			
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected error while creating user: " + e.getMessage(), e);
		}
	}
	
	public List<UserApplicationsDTO> getAllUserApplications() {
		try {
			List<UserApplications> userApplications = applicationsRepository.findAll();
			
			if(userApplications == null || userApplications.isEmpty()) {
				return new ArrayList<>();
			}
			
			List<UserApplicationsDTO> userApplicationDTOs = new ArrayList<>();
			for(UserApplications userApplication : userApplications) {
				try {
					UserApplicationsDTO userApplicationDTO = convertToDTO(userApplication);
					userApplicationDTOs.add(userApplicationDTO);
				} catch (Exception e) {
					// Log the error and continue processing other records
					System.err.println("Error converting user application with ID: " + userApplication.getUserId() + " - " + e.getMessage());
					continue;
				}
			}
			return userApplicationDTOs;
		} catch (Exception e) {
			throw new RuntimeException("Error retrieving user applications from database: " + e.getMessage(), e);
		}
	}
	
	// Helper method to convert entity to DTO
	private UserApplicationsDTO convertToDTO(UserApplications userApplication) {
		if(userApplication == null) {
			throw new IllegalArgumentException("User application cannot be null for conversion.");
		}
		
		UserApplicationsDTO userApplicationDTO = new UserApplicationsDTO();
		userApplicationDTO.setUserId(userApplication.getUserId());
		userApplicationDTO.setUserName(userApplication.getUserName());
		userApplicationDTO.setEmail(userApplication.getEmail());
		userApplicationDTO.setPhoneNo(userApplication.getPhoneNo());
		userApplicationDTO.setCompanyId(userApplication.getCompanyId());
		userApplicationDTO.setDesignation(userApplication.getDesignation());
		userApplicationDTO.setRole(userApplication.getRole());
		userApplicationDTO.setEmployeeId(userApplication.getEmployeeId());
		userApplicationDTO.setAadhaarNo(userApplication.getAadhaarNo());
		userApplicationDTO.setApplicationStatus(userApplication.getApplicationStatus());

		// Map driving licence if present
		if (userApplication.getDrivingLicence() != null) {
			DrivingLicence dl = userApplication.getDrivingLicence();
			DrivingLicenceDTO dlDto = new DrivingLicenceDTO();
			dlDto.setId(dl.getId());
			dlDto.setUserId(dl.getUserId());
			dlDto.setLicenceNo(dl.getLicenceNo());
			dlDto.setExpirationDate(dl.getExpirationDate());
			dlDto.setRTA(dl.getRTA());
			dlDto.setAllowedVehicles(dl.getAllowedVehicles());
			userApplicationDTO.setDrivingLicence(dlDto);
		}
		return userApplicationDTO;
	}
	
	// Email validation method
	private boolean isValidEmail(String email) {
		if(email == null) {
			return false;
		}
		return emailPattern.matcher(email).matches();
	}
	
	// Phone number validation method
	private boolean isValidPhoneNumber(String phoneNo) {
		if(phoneNo == null) {
			return false;
		}
		return phonePattern.matcher(phoneNo).matches();
	}
	
	public UserApplicationsDTO getUserByName(String userName) {
		UserApplications user = applicationsRepository.findByUserName(userName);
		UserApplicationsDTO dto = convertToDTO(user);
		dto.setUserName(user.getUserName());
		dto.setCompanyId(user.getCompanyId());
		dto.setDesignation(user.getDesignation());
		dto.setEmail(user.getEmail());
		dto.setEmployeeId(user.getEmployeeId());
		dto.setPhoneNo(user.getPhoneNo());
		dto.setRole(user.getRole());
		return dto;
	}
	public UserApplicationsDTO getUserById(int id) {
		UserApplications user = applicationsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found with ID: " + id));w
		UserApplicationsDTO dto = convertToDTO(user);
		dto.setUserName(user.getUserName());
		dto.setCompanyId(user.getCompanyId());
		dto.setDesignation(user.getDesignation());
		dto.setEmail(user.getEmail());
		dto.setEmployeeId(user.getEmployeeId());
		dto.setPhoneNo(user.getPhoneNo());
		dto.setRole(user.getRole());
		return dto;
	}
	public void updateUserById(UserApplications userApplication) {
		UserApplications user=applicationsRepository.findById(userApplication.getUserId()).orElseThrow(() -> new IllegalArgumentException("User not found with ID: " + userApplication.getUserId()));
		user.setApplicationStatus(userApplication.getApplicationStatus());
		applicationsRepository.save(user);
	}
}