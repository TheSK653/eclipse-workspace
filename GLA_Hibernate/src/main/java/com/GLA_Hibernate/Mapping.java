package com.GLA_Hibernate;

import org.hibernate.cfg.*;
import org.hibernate.*;
import Entity.Question;
import Entity.Answer;


public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hiber.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		Question q1 = new Question(1, "What is Java?");
		Question q2 = new Question(2, "What is OS?");
		Question q3 = new Question(3, "What is Reast?");
		Question q4 = new Question(4, "What is DBMS?");
		
		Answer a1 = new Answer(1, "OS is an operating system");
		q2.setAnswer(a1);
		Answer a2 = new Answer(2, "DBMS is a database management system");
		q4.setAnswer(a2);
		Answer a3 = new Answer(3, "Java is a programming language");
		q1.setAnswer(a3);
		Answer a4 = new Answer(4, "Reast is a framework");
		q3.setAnswer(a4);
		
		session.beginTransaction();
		session.persist(q1);
		session.persist(q2);
		session.persist(q3);
		session.persist(q4);
		session.persist(a1);
		session.persist(a2);
		session.persist(a3);
		session.persist(a4);
		session.getTransaction().commit();
		session.close();

	}

}
