package com.luv2code.springdemo.interfaces.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class RandomFortuneService implements FortuneService{

	@Value("${fortune1}")
	private String fortune1;
	@Value("${fortune2}")
	private String fortune2;
	@Value("${fortune3}")
	private String fortune3;
	@Value("${fortune4}")
	private String fortune4;
	@Value("${fortune5}")
	private String fortune5;
	@Value("${fortune6}")
	private String fortune6;
	
	@Override
	public String getFortune() {
		List<String> fortunes = new ArrayList<>();
		
		fortunes.add(fortune1);
		fortunes.add(fortune2);
		fortunes.add(fortune3);
		fortunes.add(fortune4);
		fortunes.add(fortune5);
		fortunes.add(fortune6);
		
		Random random = new Random();
		int index = random.nextInt(fortunes.size());
		
		return fortunes.get(index);
		
	}
	
	
	
}
