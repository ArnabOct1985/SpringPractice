package com.arnab.spring.annotation.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.annotation.componentscan.Employee;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        Employee employee = context.getBean("employee", Employee.class);
        employee.getEmployeedetails();
        context.close();
    }
}