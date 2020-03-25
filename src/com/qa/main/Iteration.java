package com.qa.main;

public class Iteration {
	
	public void callMethod() {
		appendixB();
		appendixC();
		nestedLoopTest();
		countingCounter();
	}
	
	public void appendixB() {
		for (int A = 100; A <= 200; A++) {
			System.out.print(A);
		}
		System.out.println("");
	}
	
	public void appendixC() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.print(" - ");
			} else {
				System.out.print(" * ");
			}
		}
		System.out.println("");
	}
	
	public void nestedLoopTest() {
		
		for (int number = 1; number <= 10; number++){
			for (int count = 1; count <= 10; count++) {
				System.out.print(number);
			}
		}
		System.out.println("");
	}
	
	public void countingCounter() {
		for (int number = 1; number <= 10; number++){
			for (int count = 1; count <= number; count++) {
				System.out.print(number);
			}
		}
		System.out.println("");
	}

}
