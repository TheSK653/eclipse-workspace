package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UserApplicationsDTO;
import com.example.demo.Service.UserApplicationService;
import com.example.demo.entity.UserApplications;

@RestController
public class UserApplicationsController {
	
	@Autowired
	private UserApplicationService userApplicationService;
	
	@PostMapping("/api/applications/new")
	public void createUser(@RequestBody UserApplications userApplication) {
	    userApplicationService.createUser(userApplication);
	}
	
	@GetMapping("/api/applications")
	public List<UserApplicationsDTO> getAllUserApplications() {
		return userApplicationService.getAllUserApplications();
	}
	@GetMapping("/api/applications/{userName}")
	public ResponseEntity<UserApplicationsDTO> getUserByUserName(@PathVariable String userName) {
		return new ResponseEntity<UserApplicationsDTO>(userApplicationService.getUserByName(userName), HttpStatus.OK);
	}
	@PostMapping("/api/applications/approvereject")
	public void updateUserById(@RequestBody UserApplications userApplication) {
		userApplicationService.updateUserById(userApplication);
	}
	@GetMapping("/api/applications/{id}")
	public ResponseEntity<UserApplicationsDTO> getUserById(@PathVariable int id) {
		return new ResponseEntity<UserApplicationsDTO>(userApplicationService.getUserById(id), HttpStatus.OK);
	}
}