package com.saurabh.annotationPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService{
	List<String> list;
	//Init() method to read the file
	@PostConstruct
	public void doSomeInit() throws FileNotFoundException {
		System.out.println(">> FileFortuneService:: Calling doSomeInit() method");
		File file = new File("C:\\Users\\Saurabh\\git\\Spring-demo-annotations\\Spring-demo-annotations\\src\\fortune.txt");
		Scanner in = new Scanner(file);
		list = new ArrayList<>();
		while(in.hasNextLine()) {
			list.add(in.nextLine());
		}
		
	}
	
	@Override
	public String getFortune() {
		Random random = new Random();
		int index = random.nextInt(list.size());
		return list.get(index);
	}
	
	@PreDestroy
	public void doSomeDestroy() {
		System.out.println(">> FileFortuneService:: Calling doSomeDestroy() method");
	}
}
