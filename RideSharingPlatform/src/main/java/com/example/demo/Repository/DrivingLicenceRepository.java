package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.DrivingLicence;

public interface DrivingLicenceRepository extends JpaRepository<DrivingLicence, Integer> {
		
}
