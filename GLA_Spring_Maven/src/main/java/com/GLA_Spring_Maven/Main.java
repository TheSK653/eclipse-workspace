package com.GLA_Spring_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext app=new AnnotationConfigApplicationContext(AppConfig.class);
		Student s=(Student)app.getBean(Student.class);
		System.out.println(s.getRollNo());
		System.out.println(s.getsName());
		
	}
}
