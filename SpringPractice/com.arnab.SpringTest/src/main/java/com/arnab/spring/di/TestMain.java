package com.arnab.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext("com.arnab.spring.di");
		
		User user = context.getBean("user", User.class);
        user.getCarDetails();
        
        
        context.close();

	}

}
