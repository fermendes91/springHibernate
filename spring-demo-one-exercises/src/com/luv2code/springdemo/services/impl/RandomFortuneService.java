package com.luv2code.springdemo.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.luv2code.springdemo.services.FortuneService;

/**
 * EXERCISE CLASS
 * @author jrfer
 *
 */
public class RandomFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		List<String> fortunes = new ArrayList<>();
		fortunes.add("Tomorrow is gonna be awesome for you");
		fortunes.add("Today is your way to get better");
		fortunes.add("Yesterday will not be so amazing as the future");
		fortunes.add("Beware of the wolf in sheep's clothing");
		fortunes.add("Diligence is the mother of good luck");
		fortunes.add("The journey is the reward");
		
		int rnd = new Random().nextInt(fortunes.size());
		
		return fortunes.get(rnd);
	}

}
