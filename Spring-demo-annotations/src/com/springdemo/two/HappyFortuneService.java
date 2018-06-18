package com.springdemo.two;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Soon you will meet with your soulmate!";
	}
}
