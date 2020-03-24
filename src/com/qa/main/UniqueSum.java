package com.qa.main;

public class UniqueSum {
	
	public void callMethod() {
		
		int inputFirstNum = 5;
		int inputSecNum = 4;
		int inputThirdNum = 5;
		
		System.out.println(runSum(inputFirstNum, inputSecNum, inputThirdNum));
		
	}
	
	public int runSum(int firstNum, int secNum, int thirdNum) {
		
		int total = 0;
		
		if (firstNum != secNum && firstNum != thirdNum) {
			total += firstNum;
		}
		if (secNum != firstNum && secNum != thirdNum) {
			total += secNum;
		}
		if (thirdNum != firstNum && thirdNum != secNum) {
			total += thirdNum;
		}
		
		return total;
	}

}
