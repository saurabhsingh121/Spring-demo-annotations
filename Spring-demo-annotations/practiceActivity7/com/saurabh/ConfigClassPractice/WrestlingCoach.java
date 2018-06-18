package com.saurabh.ConfigClassPractice;

import org.springframework.beans.factory.annotation.Value;

public class WrestlingCoach implements Coach{

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public WrestlingCoach(FortuneService theFortuneService) {
		System.out.println(">>Inside WrestlingCoach parameterized constructor");
		this.fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Try a new strategy today!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return this.email;
	}
	public String getTeam() {
		return this.team;
	}
}
