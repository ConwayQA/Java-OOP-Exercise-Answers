package com.qa.main;

public class Conditionals {
	
	public void callMethod() {

		int number1 = 21;
		int number2 = 31;
		boolean bool1 = false;
		
		System.out.println(sumOrMultiply(number1, number2, bool1));
		
	}
	
	public int sumOrMultiply(int value1, int value2, boolean bool1) {
		
		if ((value1 % 2) == 0 || (value2 % 2) == 0) {
			return 0;
		}
		
		if (bool1 == true) {
			System.out.println(value1 + " + " + value2 + " = ");
			return (value1 + value2);
		} else {
			System.out.println(value1 + " x " + value2 + " = ");
			return (value1 * value2);
		}
		
	}
	
}
