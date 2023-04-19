package com.arnab.spring.di;

import org.springframework.stereotype.Component;

@Component
public class Honda implements Vehicle {

	public void getDetails() {
		System.out.println("Honda Engine");
	}

}
