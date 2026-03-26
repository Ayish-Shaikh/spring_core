package com.example.componentScan.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    // FIELD INJECTION
    @Autowired
    private Employee employee;


    //  CONSTRUCTOR INJECTION  ----> RECOMMENDED
//    @Autowired
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
