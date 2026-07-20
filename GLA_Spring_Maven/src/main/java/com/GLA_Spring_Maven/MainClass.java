package com.GLA_Spring_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student s = (Student) app.getBean(Student.class);
		System.out.println(s.getRollNo());
		System.out.println(s.getsName());
		System.out.println(s.getSubject());
		System.out.println(s.getAddr().getCity());
		
		Hello h = (Hello) app.getBean(Hello.class);
		System.out.println(h.getId());
		System.out.println(h.getMessage());

	}

}
