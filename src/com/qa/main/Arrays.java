package com.qa.main;

public class Arrays {
	
	public void callMethod() {
		arrayExample();
		arrayExample2();
	}
	
	public void arrayExample() {
		int[] testArray = new int[10];
		for (int i = 0; i < 10; i++) {
			testArray[i] = i + 1;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(testArray[i]);
		}
	}
	
	public void arrayExample2() {
		int[] testArray = new int[10];
		for (int i = 0; i < 10; i++) {
			testArray[i] = i + 1;
			System.out.println(testArray[i]);
		}
		
		for (int i = 0; i < 10; i++) {
			testArray[i] *= 10;
			System.out.println(testArray[i]);
		}
	}

}
