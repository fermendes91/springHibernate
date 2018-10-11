package com.luv2code.springdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class BasketCoach implements Coach{

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice throw ball from 3 points area";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
