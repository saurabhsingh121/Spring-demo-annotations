package com.springdemo.two;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		//load config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextOld2.xml");
		
		//retrieve bean from the container
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		Coach newCoach = context.getBean("tennisCoach",Coach.class);
		//Check if they are same
		boolean result = (coach == newCoach);
		
		//print out the result
		System.out.println("\nPointing to the same object: "+result);
		
		//Printing the memory location of the object
		System.out.println("\nMemory location for the coach: "+ coach);
		System.out.println("\nMemory location for the new coach"+ newCoach +"\n");
		
		//close thw context
		context.close();
	}
}
