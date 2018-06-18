package com.saurabh.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("theSillyCoach")
@Component
public class TennisCoach implements Coach {
	
	//Field injection
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneServiceThree;
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
			return fortuneServiceThree.getFortune();
}
}
