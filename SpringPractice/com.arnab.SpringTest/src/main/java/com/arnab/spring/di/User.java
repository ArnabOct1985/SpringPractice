package com.arnab.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Autowired
	Honda vehicle;
	
	public void getCarDetails() {
		vehicle.getDetails();
	}
}
