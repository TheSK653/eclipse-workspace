package com.GLA_Hibernate;

import org.hibernate.cfg.*;
import org.hibernate.*;
import Entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
//		Student st= session.find(Student.class, 1);
//		System.out.println(st.getName());

		Student s1 = new Student();
		s1.setName("Rohit");
		s1.setCourse("BCA");
		s1.setSubject("Python");
		
		session.beginTransaction();
		session.persist(s1);
		session.getTransaction().commit();
		session.close();	
		
	}

}
