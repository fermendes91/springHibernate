package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.models.SoccerCoach;

public class PracticeApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		SoccerCoach theCoach = context.getBean("mySoccerCoach", SoccerCoach.class);
		
		// call methods on the bean
		// ...let's come back to this ...
		System.out.println("\n" + theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// call our new methods to get the literal values
		System.out.println("\n" + theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// implement the new random fortune
		System.out.println(theCoach.getRandomFortune());
		
		// verify the scope of soccerCoachs
		SoccerCoach otherCoach = context.getBean("mySoccerCoach", SoccerCoach.class);
		System.out.println(theCoach.equals(otherCoach)); // if we change scope por singleton, the reference will be the same.
		
		// close context
		context.close();
	}

}
