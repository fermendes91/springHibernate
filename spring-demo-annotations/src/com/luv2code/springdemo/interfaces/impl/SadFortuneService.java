package com.luv2code.springdemo.interfaces.impl;

import com.luv2code.springdemo.interfaces.FortuneService;

public class SadFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
