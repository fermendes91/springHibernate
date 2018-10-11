package com.luv2code.springdemo.services;

import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.interfaces.FortuneService;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice is the best way to get better";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
