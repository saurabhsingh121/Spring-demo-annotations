package com.springdemo.two;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of String
	private String[] data = {
			"Beware of the wolf in sheep's clothing.",
			"Diligence is the mother of good luck.",
			"The journey is the reward."
	};
	//create a random number generator
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int i = myRandom.nextInt(data.length);
		return data[i];
	}

}
