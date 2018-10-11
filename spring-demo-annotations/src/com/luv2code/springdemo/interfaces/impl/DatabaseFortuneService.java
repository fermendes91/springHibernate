package com.luv2code.springdemo.interfaces.impl;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Database Fortune Mother of God <3";
	}

}
