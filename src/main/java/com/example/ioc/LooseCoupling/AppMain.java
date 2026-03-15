package com.example.ioc.LooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        UserService userServiceSMS
                = (UserService) context.getBean("UserServiceSMS");
        userServiceSMS.notifyUser("hello what's up");

        UserService userServiceEmail
                = (UserService) context.getBean("UserServiceEmail");
        userServiceEmail.notifyUser("hello what's up");
    }
}
