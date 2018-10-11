package com.luv2code.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springdemo.interfaces.FortuneService;
import com.luv2code.springdemo.interfaces.impl.BestFortuneService;
import com.luv2code.springdemo.services.SoccerCoach;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
public class SpringConfiguration {

	@Bean
	public FortuneService bestFortuneService() {
		return new BestFortuneService();
	}
	
	@Bean 
	public SoccerCoach soccerCoach(FortuneService fortuneService) {
		return new SoccerCoach(bestFortuneService());
	}
}
