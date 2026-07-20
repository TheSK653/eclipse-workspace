
package com.example.demo.DTO;

import lombok.Data;

@Data
public class UserApplicationsDTO {
	private Integer userId;
	private String userName;
	private String email;
	private String phoneNo;
	private Integer companyId;
	private String designation;
	private String role;
	private String employeeId;
	private String aadhaarNo;
	private String applicationStatus;

	// Include driving licence details as nested DTO
	private DrivingLicenceDTO drivingLicence;

}
