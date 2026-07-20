package com.example.demo.entity;

//import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Companies")
@Data
public class Companies {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String companyName;
	private String buildingName;
	private String securityInchargeName;
	private String securityHelpdeskNumber;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getSecurityInchargeName() {
		return securityInchargeName;
	}
	public void setSecurityInchargeName(String securityInchargeName) {
		this.securityInchargeName = securityInchargeName;
	}
	public String getSecurityHelpDeskNumber() {
		return securityHelpdeskNumber;
	}
	public void setSecurityHelpdeskNumber(String securityHelpdeskNumber) {
		this.securityHelpdeskNumber = securityHelpdeskNumber;
	}
	
}
