package com.example.componentScan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext("AppConfig.class");
        Employee employee = context.getBean("employee1", Employee.class);
        System.out.println(employee.toString());
        System.out.println("*********The salary is in LPA*********");
    }
}