package com.example.componentScan.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.componentScan.autowired.annotation.Employee;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
            = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());


        Manager manager = context.getBean("manager", Manager.class);
        System.out.println(manager.toString());
        System.out.println("*********The salary is in LPA*********");
    }
}