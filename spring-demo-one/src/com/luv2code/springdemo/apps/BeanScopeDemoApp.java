package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.services.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same bean
		boolean result = theCoach.equals(alphaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same Object: " + result);
		System.out.println("\nMemory location for the theCoach: " + theCoach);
		System.out.println("Memory location for the alphaCoach: " + alphaCoach);

		//close context
		context.close();
	}

}
