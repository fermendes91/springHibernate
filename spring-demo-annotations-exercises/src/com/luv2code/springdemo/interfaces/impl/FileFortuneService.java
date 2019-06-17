package com.luv2code.springdemo.interfaces.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.interfaces.FortuneService;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "C:\\develop\\workspaces\\springHibernate\\sports-fortune.properties";
	private List<String> theFortunes;
	
	// create a random number generator
	private Random random = new Random();
	
	public FileFortuneService() {
		System.out.println(">> FileFortuneService: inside default constructor");
	}
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = random.nextInt(theFortunes.size());
		
		return theFortunes.get(index);
	}
	
	@PostConstruct
	public void loadTheFortunesFile() {
		System.out.println(">> FileFortuneService: inside method loadTheFortunesFile");
		
		File file = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + file);
		System.out.println("File exists?: " + file.exists());
		
		// initialize ArrayList
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String tempLine;
			
			while((tempLine = br.readLine()) != null ) {
				theFortunes.add(tempLine.split("=")[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


}
