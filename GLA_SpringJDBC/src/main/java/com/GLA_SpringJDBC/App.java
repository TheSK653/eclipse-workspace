package com.GLA_SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

    public static void main(String[] args) {

        // Create Spring Container
        ApplicationContext app =new AnnotationConfigApplicationContext(AppConfig.class);

        // Get JdbcTemplate bean
        JdbcTemplate jdbcTemplate =app.getBean(JdbcTemplate.class);

//        // SQL query
//        String query ="INSERT INTO student VALUES (1, 'Soham', 'Bangla')";
//
//        // Execute query
//        int rows = jdbcTemplate.update(query);
//
//        System.out.println(rows + " row inserted.");
    }
}