package com.springdemo.two;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		
		//read config Java class
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		//get the bean from Spring container
		//Coach tennisCoach = ctx.getBean("theSillyCoach",Coach.class);
		Coach tennisCoach = ctx.getBean("tennisCoach",Coach.class);
		TennisCoach tennisCoach2 = ctx.getBean("tennisCoach",TennisCoach.class);
		//call the method on that bean
		System.out.println(tennisCoach.getDailyWorkout());
		//call the method to get daily fortune
		for(int i = 0; i < 5; i++) {
			System.out.println(tennisCoach.getDailyFortune());
		}
		//printing two injected filed (In property file)
		System.out.println(tennisCoach2.getEmail());
		System.out.println(tennisCoach2.getTeam());
		//close the context
		ctx.close();
	}
}
