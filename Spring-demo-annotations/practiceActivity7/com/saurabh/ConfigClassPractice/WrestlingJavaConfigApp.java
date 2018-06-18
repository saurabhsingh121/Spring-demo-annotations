package com.saurabh.ConfigClassPractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WrestlingJavaConfigApp {
	
	public static void main(String[] args) {
		//load the Spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		//get the bean from spring container
		Coach myCoach = context.getBean("wrestlingCoach",Coach.class);
		//Specific class refernece to get email and team detail
		/*WrestlingCoach myCoach = context.getBean("wrestlingCoach",WrestlingCoach.class);
		System.out.println(myCoach.getEmail());
		System.out.println(myCoach.getTeam());*/
		//call a method on the bean
		System.out.println(myCoach.getDailyWorkout());
		//call a method to get daily fortune
		System.out.println(myCoach.getDailyFortune());
		//close the context
		context.close();
	}
}
