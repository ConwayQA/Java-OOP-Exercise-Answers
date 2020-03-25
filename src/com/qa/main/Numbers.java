package com.qa.main;

import java.util.Stack;

public class Numbers {
	
	public void callMethod() {
		
		int digitNumber = 9000;
		
		sumDigits(digitNumber);
		System.out.println("------------------------------------------------------------------------------------");
		
		System.out.println("Your inputted number = " + digitNumber);
		System.out.println("Your inputted number = " + convertDigitToString(digitNumber));
		
		System.out.println("------------------------------------------------------------------------------------");
		
//		int countNumber = 1;
//		while (countNumber < 100) {
//			System.out.println(convertDigitToString(countNumber));
//			countNumber++;
//		}
	}
	
	public void sumDigits(int number) {
		
		int tempNumber = number;
		int sumDigits = 0;
		int counter = 0;
		Stack<Integer> sumStack = new Stack<Integer>();
		
		while (tempNumber > 0) {
			sumStack.push(tempNumber % 10);
			tempNumber /= 10;
			counter++;
		}
		
		System.out.print("The digits of " + number + " are ");
		
		while (!sumStack.isEmpty()) {
			tempNumber = sumStack.pop();
			sumDigits += tempNumber;
			counter--;
			if (counter == 0) {
				System.out.print("and ");
			}
			System.out.print(tempNumber + " ");
		}
		System.out.println("");
		System.out.println("The sum of these digits are: " + sumDigits);
		
	}
	
	public String convertDigitToString(int number) {
		
		if (number == 0) {
			return "zero";
		}
		
		String outputString = "";
		
		Stack<Integer> converterStack = new Stack<Integer>();
		int tempNumber = number;
		int teenChecker = number % 100;
		int counter = 0;
		
		while (tempNumber > 0) {
			if (teenChecker > 9 && teenChecker <20 && counter == 0) {
				converterStack.push(teenChecker);
				counter += 2;
				tempNumber /= 100;
			}
			converterStack.push(tempNumber % 10);
			counter ++;
			tempNumber /= 10;
		}
		
		while(!converterStack.isEmpty()) {
			tempNumber = converterStack.pop();
			if (tempNumber > 9) {
				//convert teens
				outputString += convertTeens(tempNumber);
			} else if (tempNumber <= 9 && counter > 3) {
				//convert thousands
				outputString += convertThousands(tempNumber);
			} else if (tempNumber <= 9 && counter > 2) {
				//convert hundreds
				outputString += convertHundreds(tempNumber);
			} else if (tempNumber <= 9 && counter > 1) {
				//convert tens
				outputString += convertTens(tempNumber);
			} else {
				//convert units
				outputString += convertUnits(tempNumber);
			}
			counter --;
			
		}
		
		return outputString;
	}
	
	public String convertUnits(int number) {
		
		switch(number) {
		case 0:
			return "";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9: 
			return "nine";
		default:
			return "";
		}
	}
	
	public String convertTeens(int number) {
		
		switch(number) {
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19: 
			return "nineteen";
		default:
			return "";
		}
	}
	
	public String convertTens(int number) {
		
		switch(number) {
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "forty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9: 
			return "ninety";
		default:
			return "";
		}
		
	}
	
	public String convertHundreds(int number) {
		
		switch(number) {
		case 1:
			return "one hundred and ";
		case 2:
			return "two hundred and ";
		case 3:
			return "three hundred and ";
		case 4:
			return "four hundred and ";
		case 5:
			return "five hundred and ";
		case 6:
			return "six hundred and ";
		case 7:
			return "seven hundred and ";
		case 8:
			return "eight hundred and ";
		case 9: 
			return "nine hundred and ";
		default:
			return "";
		}
		
	}

	public String convertThousands(int number) {
	
		switch(number) {
		case 1:
			return "one thousand ";
		case 2:
			return "two thousand ";
		case 3:
			return "three thousand ";
		case 4:
			return "four thousand ";
		case 5:
			return "five thousand ";
		case 6:
			return "six thousand ";
		case 7:
			return "seven thousand ";
		case 8:
			return "eight thousand ";
		case 9: 
			return "nine thousand ";
		default:
			return "";
		}
	
	}

}
