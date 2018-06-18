package com.saurabh.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTestApp {
	public static void main(String[] args) {
		//load the configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from the container
		Faculty scienceFaculty = context.getBean("scienceFaculty",Faculty.class);
		//call the methods
		System.out.println(scienceFaculty.studySubject());
		//close the container
		context.close();
	}
}
