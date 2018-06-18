package com.saurabh.annotations;

import org.springframework.stereotype.Component;

@Component
public class ScienceFaculty implements Faculty{
	
	// define a default constructor
		public ScienceFaculty() {
			System.out.println(">> ScienceFaculty: inside default constructor");
		}
	@Override
	public String studySubject() {
		return "Applied Science will be taught today";
	}
}
