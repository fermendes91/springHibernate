package com.luv2code.springdemo.interfaces.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	@Override
	public String getFortune() {
		//Convert array into arraylist
		List<String> fortunes = new ArrayList<>(Arrays.asList(data));
				
		Random random = new Random();
		
		int index = random.nextInt(fortunes.size());
		
		return fortunes.get(index);
	}

}
