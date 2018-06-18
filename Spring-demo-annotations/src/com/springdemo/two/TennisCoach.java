package com.springdemo.two;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("theSillyCoach")
@Component
public class TennisCoach implements Coach {
	
	//Field injection
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneServiceOne;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneServiceTwo;
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneServiceThree;
	private boolean firstFlag = true;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> Inside the Tennis Coach Default constructor");
	}
	
	//define my init() method
	@PostConstruct
	public void doStartUpStuff() {
		System.out.println(">> TennisCoach: inside of doStartUpStuff() method");
	}
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanUpStuff() method");
	}
	
	//Autowiring dependency injection(Constructor Injection)
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		System.out.println("Sinhasan khali kro ki janta aati hai");
		this.fortuneService = fortuneService;
	}*/
	
	//define a setter method(Setter injection)
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> Inside the tennis coach setter method");
		this.fortuneService = fortuneService;
	}*/
	
	//define any custom method(Custom method injection)
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> Inside doSomeCrazyStuff method");
		this.fortuneService = theFortuneService;
	}*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	@Override
	public String getDailyFortune() {
		String result = null;
		if(firstFlag) {
			result = fortuneServiceThree.getFortune();
		}
		else {
			result = fortuneServiceOne.getFortune();
		}
		firstFlag =!firstFlag;
		return result;}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
}
