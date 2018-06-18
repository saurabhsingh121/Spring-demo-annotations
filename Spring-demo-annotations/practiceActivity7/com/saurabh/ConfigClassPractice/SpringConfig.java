package com.saurabh.ConfigClassPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//This class is used for Spring bean and other configuratin
@Configuration
@PropertySource("classpath:sports.properties")
public class SpringConfig {
	
	//define bean for our happy fortune service
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	//define bean for our wrestling coach and inject dependency
	@Bean
	public Coach wrestlingCoach() {
		WrestlingCoach wresCoach = new WrestlingCoach(happyFortuneService());
		return wresCoach;
	}
	
}
