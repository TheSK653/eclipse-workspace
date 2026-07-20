package com.example.demo.DTO;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class DrivingLicenceDTO {
    private Integer id;
    private Integer userId;
    private String licenceNo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate expirationDate;

    private String RTA;
    private String allowedVehicles;
}
