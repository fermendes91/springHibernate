package com.luv2code.springdemo.services.impl;

import com.luv2code.springdemo.services.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day !!";
	}
	
}
