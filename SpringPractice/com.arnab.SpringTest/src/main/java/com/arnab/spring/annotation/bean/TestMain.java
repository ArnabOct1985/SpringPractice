package com.arnab.spring.annotation.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext("com.arnab.spring.annotation.bean");

        //context.scan("com.emexo.spring.annotation.bean");
        //context.refresh();

        Employee employee = context.getBean("employee", Employee.class);
        employee.getEmployeeDetails();
        
        context.close();

    }
}