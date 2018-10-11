package com.luv2code.springdemo.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.interfaces.Coach;

public class ReadFileFortuneServiceApp {

	public static void main(String[] args) {
		// read spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("basketCoach", Coach.class);
		
		System.out.println(theCoach.getDailyFortune());

	}

}
