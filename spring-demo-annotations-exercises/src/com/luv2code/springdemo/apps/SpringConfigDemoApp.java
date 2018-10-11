package com.luv2code.springdemo.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.config.SpringConfiguration;
import com.luv2code.springdemo.interfaces.Coach;

public class SpringConfigDemoApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
		System.out.println(soccerCoach.getDailyFortune());
	}

}
