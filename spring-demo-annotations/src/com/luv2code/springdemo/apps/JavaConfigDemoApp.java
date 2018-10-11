package com.luv2code.springdemo.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.config.SportConfig;
import com.luv2code.springdemo.interfaces.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		// get the bean from spring container
		Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class); //ID defined inside bean
		Coach basketCoach = context.getBean("basketCoach", Coach.class); //Default ID from Bean
		
		// call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(basketCoach.getDailyWorkout());

		// call a method to get the daily fortune
		System.out.println("TennisCoach: " + tennisCoach.getDailyFortune());
		System.out.println("BasketCoach: " + basketCoach.getDailyFortune());
		
		// close context
		context.close();
		
	}

}
