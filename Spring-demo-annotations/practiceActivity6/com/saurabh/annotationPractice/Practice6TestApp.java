package com.saurabh.annotationPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice6TestApp {
	
	public static void main(String[] args) {
		//load the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");
		
		//retrieve the bean from the container
		Coach myCoach = context.getBean("shootingCoach",Coach.class);
		
		//call the method on that bean
		System.out.println(myCoach.getDailyWorkout());
		
		//call the method to get Daily fortune
		System.out.println(myCoach.getDailyFortune());
		
		//close the context
		context.close();
	}
}
