package com.in28minutes.springboot.rest.example.student;

public class StudentNotFoundException extends RuntimeException {
	
	private static final long serialVerionUID =1L;
	
	public StudentNotFoundException(String exception) {
		super(exception);
	}

}
