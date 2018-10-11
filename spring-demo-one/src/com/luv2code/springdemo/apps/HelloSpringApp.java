package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.services.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve a bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		/**
		 * EXERCISE INVERSION OF CONTROL
		 */
		Coach theSoccerCoach = context.getBean("mySoccerCoach", Coach.class);
		System.out.println(theSoccerCoach.getDailyWorkout());
		
		
		// close the context
		context.close();
		
	}

}
