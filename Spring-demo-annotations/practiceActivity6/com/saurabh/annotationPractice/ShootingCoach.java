package com.saurabh.annotationPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShootingCoach implements Coach{
	//Dependency injection
	@Autowired
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Hit the bull's eye!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
