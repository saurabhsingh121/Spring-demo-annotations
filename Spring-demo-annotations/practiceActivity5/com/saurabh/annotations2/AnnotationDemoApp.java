package com.saurabh.annotations2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		
		//read config file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext5.xml");
		//get the bean from Spring container
		//Coach tennisCoach = ctx.getBean("theSillyCoach",Coach.class);
		Coach tennisCoach = ctx.getBean("tennisCoach",Coach.class);
		//call the method on that bean
		System.out.println(tennisCoach.getDailyWorkout());
		//call the method to get daily fortune
		System.out.println(tennisCoach.getDailyFortune());
		//close the context
		ctx.close();
	}
}
