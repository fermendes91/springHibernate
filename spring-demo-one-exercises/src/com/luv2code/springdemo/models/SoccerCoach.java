package com.luv2code.springdemo.models;

import com.luv2code.springdemo.services.Coach;
import com.luv2code.springdemo.services.impl.RandomFortuneService;

public class SoccerCoach implements Coach{

	//define a private field for the dependency
	private RandomFortuneService randomFortuneService;
	
	private String emailAddress;
	private String team;
	
	/* Define a constructor for dependency injection
	 
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Spend 2 hours of training, whatever the weather";
	}

	public RandomFortuneService getRandomFortuneService() {
		return randomFortuneService;
	}

	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyFortune() {
		return "Daily Fortune method for Soccer Coach";
	}

	@Override
	public String getRandomFortune() {
		return randomFortuneService.getFortune();
	}
	
}
