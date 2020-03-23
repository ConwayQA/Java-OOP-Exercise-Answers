package com.qa.main;

public class Maths {
	
	public void question2() {

		//Question 1
		int input1 = 42;
		int input2 = 35;
		System.out.println(sumMethod(input1, input2));
		
		//Question 2
		System.out.println(multiplyMethod(input1, input2));
		System.out.println(subtractMethod(input1, input2));
		
		
		//Question 3 + 4
		double double1 = 12.65;
		double double2 = 22.53;
		System.out.println(divideMethod(double1, double2));
	}
	
	public int sumMethod(int num1, int num2) {
		return (num1 + num2);
	}
	
	
	//Question 2 Methods
	public int multiplyMethod(int num1, int num2) {
		return (num1 * num2);
	}
	public static int subtractMethod(int num1, int num2) {
		return (num1 - num2);
	}
	
	//question 3 + 4
	public double divideMethod(double num1, double num2) {
		if (num1 > num2) {
			return (num1 / num2);	
		} else {
			System.out.println("Division cannot be preformed");
			return 0;
		}
		
	}

}
