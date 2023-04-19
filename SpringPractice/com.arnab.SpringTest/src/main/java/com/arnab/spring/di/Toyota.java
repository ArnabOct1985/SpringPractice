package com.arnab.spring.di;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Vehicle {

	public void getDetails() {
		System.out.println("Toyota Engine");
	}

}
