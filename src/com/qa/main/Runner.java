package com.qa.main;


// Answers for questions in the Hello World! Section of OOP Exercise Book
//Unquote the questions in 'main' that you want to see the answers to!

public class Runner {

	public static void main(String[] args) {
		// Run solutions for Beginner Hello World Questions
		//question1();
		//question2();
		//question3();
		//question4();
		//question4ApendixA();
		//question5();
		//question6();
		//question7();
		question8();
		//question9();
		//question10();
		
	}
	
	//Call each method bellow from main class to run code for each question.
	//Method named appropriately for each question set.
	public static void question1() {
		String greetings = "Hello World!";
		HelloWorld q1 = new HelloWorld();
		q1.callMethod(greetings);
		q1.questionSet1();
	}
	
	public static void question2() {
		Maths q2 = new Maths();
		q2.question2();
	}
	
	public static void question3() {
		Calculations results = new Calculations();
		results.callMethod();
	}
	
	public static void question4() {
		Conditionals runCalc = new Conditionals();
		runCalc.callMethod();
	}
	
	public static void question4ApendixA() {
		NumberChecker check1 = new NumberChecker();
		check1.callMethod();
	}
	
	public static void question5() {
		BlackJack runBlackJack = new BlackJack();
		runBlackJack.callMethod();
	}
	
	public static void question6() {
		UniqueSum runUniqueSum = new UniqueSum();
		runUniqueSum.callMethod();
	}
	
	public static void question7() {
		Taxes runTaxes = new Taxes();
		runTaxes.callMethod();
	}
	
	public static void question8() {
		Numbers runNumbers = new Numbers();
		runNumbers.callMethod();
	}
	
	public static void question9() {
		Iteration runIteration = new Iteration();
		runIteration.callMethod();
	}
	
	public static void question10() {
		Coins runCoins = new Coins();
		runCoins.callMethod();
	}

}
