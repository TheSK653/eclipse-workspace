package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CompaniesDTO;
import com.example.demo.Service.CompaniesService;

@RestController
public class CompaniesController {
	@Autowired
	private CompaniesService companiesService;
	
	@GetMapping("/api/companies")
	public CompaniesDTO getAllCompanies() {
		List<CompaniesDTO> companies = companiesService.getAllCompanies();
		if (companies.isEmpty()) {
			return null; // or return an empty CompaniesDTO object
		}
		return companies.get(0); // Return the first company in the list
	}
}
