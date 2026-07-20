package com.GLA_Spring_Data_JPA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import Dao.StudentDao;
import Entity.Student;

@ComponentScan(basePackages = {"Dao", "Configuration", "com.GLA_Spring_data_JPA"})
@EnableJpaRepositories(basePackages = "Dao")
@EnableTransactionManagement
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new AnnotationConfigApplicationContext(App.class);
        StudentDao studentDao = app.getBean(StudentDao.class);
        Student s = new Student();
        s.setCourse("Java");
        s.setSid(1);
        s.setName("Jay");
        
        studentDao.insert(s);
//        studentDao.delete(0);
    }
}