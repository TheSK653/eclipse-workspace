package com.GLA_Spring_Maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static ApplicationContext app;

    public static void main(String[] args) {

        app = new ClassPathXmlApplicationContext("Spring-config.xml");

        // Student bean
        Student s = (Student) app.getBean("stud");
        System.out.println(s.getRollNo());
        System.out.println(s.getsName());
        System.out.println(s.getSubject());
        System.out.println(s.getAddr().getCity());
        System.out.println(s.getAddr().getState());

        // Print all bean names
        String[] beans = app.getBeanDefinitionNames();
        for (int i = 0; i < beans.length; i++) {
            System.out.println(beans[i]);
        }

        // Hello bean
        Hello h = (Hello) app.getBean("hello");
        System.out.println(h.getId());
        System.out.println(h.getMessage());

        // Second student bean
        Student s2 = (Student) app.getBean("stud1");
        System.out.println(s2.getRollNo());
        System.out.println(s2.getsName());
        System.out.println(s2.getSubject());
    }
}