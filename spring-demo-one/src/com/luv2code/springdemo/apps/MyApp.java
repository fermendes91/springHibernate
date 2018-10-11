package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.models.TrackCoach;
import com.luv2code.springdemo.services.Coach;

public class MyApp {

	public static void main(String[] args) {
		//create the object
		Coach theCoach = new TrackCoach();
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
