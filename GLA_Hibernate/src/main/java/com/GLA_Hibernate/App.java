package com.GLA_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("hiber.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	
    	Student s = new Student();
//    	s.setSid(1);
    	s.setName("Rohit");
    	s.setCourse("BCA");
    	s.setSubject("Python");
    	
    	Student s1 = new Student();
////    	s1.setSid(567);
    	s1.setName("Ronit");
    	s1.setCourse("B.sc");
    	s1.setSubject("Chemistry");
    	
    	session.beginTransaction();
    	session.persist(s);
    	session.persist(s1);
    	session.getTransaction().commit();
    	session.close();
    	
    	
    	
    	
    	
    	
    }
}