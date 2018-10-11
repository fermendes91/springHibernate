package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring congi file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
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
