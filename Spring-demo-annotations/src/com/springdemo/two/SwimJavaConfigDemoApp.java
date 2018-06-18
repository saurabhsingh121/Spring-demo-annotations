package com.springdemo.two;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	public static void main(String[] args) {
		//load Spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//get the bean from spring container
		//Coach theCoach = context.getBean("swimCoach",Coach.class);
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call the method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Email: "+theCoach.getEmail());
		System.out.println("Team: "+theCoach.getTeam());
		//close the context
		context.close();
	}
}
