package com.qa.main;

import java.util.Scanner;

public class NumberChecker {
	
	public void callMethod() {

		Scanner input = new Scanner(System.in);
		System.out.println("Please input your number: ");
		int number1 = input.nextInt();
		
		scannerCheck(number1);
		
		input.close();
	}
	
	public void scannerCheck(int A) {
		
		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println("1");
			if (A > 100) {
				System.out.println("3");
				if (A > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (A > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}

}
