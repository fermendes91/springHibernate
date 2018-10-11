package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach alphaCoach = context.getBean("thatSillyCoach", Coach.class);

		// check if they are the same object
		boolean result = theCoach.equals(alphaCoach);
		
		// print out the result
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		// close context
		context.close();
	}
}
