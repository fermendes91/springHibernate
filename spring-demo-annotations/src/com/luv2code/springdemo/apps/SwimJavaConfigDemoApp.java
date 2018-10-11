package com.luv2code.springdemo.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.config.SportConfig;
import com.luv2code.springdemo.interfaces.Coach;
import com.luv2code.springdemo.services.SwimCoach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file
		
		/*AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfigWithoutComponentScan.class);*/
		
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach swimCoach = context.getBean("swimCoach", Coach.class);
		SwimCoach otherSwimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(swimCoach.getDailyWorkout());

		// call a method to get the daily fortune
		System.out.println("SwimCoach: " + swimCoach.getDailyFortune());
		
		// call value properties from configuration
		System.out.println(otherSwimCoach.getEmail());
		System.out.println(otherSwimCoach.getTeam());
		
		// close context
		context.close();
		

	}

}
