package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserApplications;

public interface UserApplicationRepository extends JpaRepository<UserApplications, Integer>{
	public List<UserApplications> findByApplicationStatus(String applicationStatus);
	public UserApplications findByUserName(String userName);

}
