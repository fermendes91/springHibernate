package com.luv2code.springdemo.interfaces.impl;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class HAPPYFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Tomorrow will be a better day !";
	}

}
