package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring congi file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach basketCoach = context.getBean("basketCoach", Coach.class); //Default ID from Bean
		Coach swimCoach = context.getBean("swimCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(basketCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyWorkout());
		
		// call a method of fortunes implementations
		System.out.println(basketCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyFortune());
		
		// close context
		context.close();
		
	}

}
