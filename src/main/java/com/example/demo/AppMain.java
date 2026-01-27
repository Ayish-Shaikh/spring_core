package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("ApplicationBeanContext.xml");
        GreetingService greetingService
                = (GreetingService) context.getBean("myBean");
        GreetingService.sayHello();
    }
}
