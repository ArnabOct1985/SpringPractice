package com.arnab.spring.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    private int empId= 10;
    private String empName = "Sanjay";

    public void getEmployeeDetails(){
        System.out.println(empId);
        System.out.println(empName);
    }
    
    @PostConstruct
    public void init() {
    	System.out.println("Executing during creation of object");
    }
    
    @PreDestroy
    public void destroy() {
    	System.out.println("Executing before destroy");
    }
}