package com.saurabh.annotations2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService{
	private File file = new File("C:\\Users\\Saurabh\\Documents\\workspace-sts-3.9.4.RELEASE\\Spring-demo-annotations\\src\\fortune.txt");
	private Scanner in;
	private Random random = new Random();
	private String result;
	@Override
	public String getFortune() {
		try {
			in = new Scanner(file);
			List<String> lines = new ArrayList<>();
			while(in.hasNext()) {
				lines.add(in.nextLine());
			}
			int index = random.nextInt(lines.size());
			result = lines.get(index);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}

}
