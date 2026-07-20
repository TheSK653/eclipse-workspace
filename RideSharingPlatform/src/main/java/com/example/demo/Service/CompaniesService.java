package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CompaniesDTO;
import com.example.demo.Repository.CompaniesRepository;
import com.example.demo.entity.Companies;

@Service
public class CompaniesService {
	@Autowired
	private CompaniesRepository companiesRepository;
	
//	public List<Companies> getAllCompanies() {
	public List<CompaniesDTO> getAllCompanies() {
		// Logic to retrieve all companies from the database
		List<Companies> companies = companiesRepository.findAll();
		List<CompaniesDTO> companyDTOs = new ArrayList<>();
		for(Companies company : companies) {
			CompaniesDTO companyDTO = new CompaniesDTO();
			companyDTO.setId(company.getId());
			companyDTO.setBuildingName(company.getBuildingName());
			companyDTO.setCompanyName(company.getCompanyName());
			companyDTO.setSecurityHelpDeskNumber(company.getSecurityHelpDeskNumber());
			companyDTO.setSecurityInchargeName(company.getSecurityInchargeName());
			companyDTOs.add(companyDTO);
		}
		return companyDTOs;
//		return companiesRepository.findAll();
	}
}
