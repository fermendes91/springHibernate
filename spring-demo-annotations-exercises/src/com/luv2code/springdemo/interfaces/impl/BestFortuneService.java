package com.luv2code.springdemo.interfaces.impl;

import com.luv2code.springdemo.interfaces.FortuneService;

public class BestFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Today you have won 1.000.000 dollars! YUU..WOOAH";
	}

}
