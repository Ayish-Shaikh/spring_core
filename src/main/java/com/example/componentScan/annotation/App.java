package com.example.componentScan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springAnnotations.com.example.componentScan.Employee;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext("AppConfig.class");
        springAnnotations.com.example.componentScan.Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());
        System.out.println("*********The salary is in LPA*********");
    }
}