package com.qa.main;

public class HelloWorld {
	
	public void callMethod(String remoteGreeting) {
		
		System.out.println(remoteGreeting);
		
	}
	
	public void questionSet1() {
		// Question 1
		System.out.println("Hello World!");
		
		//Question 2
		String greetings = "Hello World!";
		System.out.println(greetings);
		
		//Question 3
		question3Method(greetings);
		
		//Question 4
		System.out.println(question4Method());
		
		
	}
	
	//Method for Hello World Question 3
	public void question3Method(String stringParameter) {
		System.out.println(stringParameter);
	}
	
	//Method for Hello World Question 4
	public String question4Method() {
		return "Hello World!";
	}

}
