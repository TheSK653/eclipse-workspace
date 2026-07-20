package com.GLA_Spring_Maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Student stud() {
		Student s = new Student();
		s.setRollNo(1);
		s.setsName("John Doe");
		s.setSubject("Mathematics");
		
		s.setAddr(addr());
		return s;
	}
	
	@Bean
	public Hello hello() {
		return new Hello(1, "Hello World");
	}
	
	@Bean
	public Address addr() {
		Address a = new Address();
		a.setCity("New York");
		a.setState("NY");
		a.setCountry("USA");
		a.setPinCode(10001);
		return a;
	}
}
