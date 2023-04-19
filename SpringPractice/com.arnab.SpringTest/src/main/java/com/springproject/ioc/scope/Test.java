package com.springproject.ioc.scope;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springproject.ioc.scope.Employee;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");

        Employee employee= context.getBean("employee", Employee.class);
        employee.getEmployeeDetails();
        System.out.println(employee.hashCode());

        Employee employee1= context.getBean("employee", Employee.class);
        employee1.getEmployeeDetails();
        System.out.println(employee1.hashCode());
    }
}