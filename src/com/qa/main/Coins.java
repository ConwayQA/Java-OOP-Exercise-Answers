package com.qa.main;

public class Coins {
	
	public void callMethod() {
		double cost = 4.56;
		double amountPayed = 200.00;
		
		calculateChange(cost, amountPayed);
	}
	
	public void calculateChange(double cost, double amount) {
		
		System.out.println("The cost is: £" + cost);
		System.out.println("The amount paid is: £" + amount);
		System.out.println("");
		
		double changeDouble = amount - cost;
		int twentyNote = 0;
		int tenNote = 0;
		int fiveNote = 0;
		int twoPound = 0;
		int onePound = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0;
		
		while (changeDouble > 0.0) {
			if (changeDouble >= 20.0) {
				twentyNote++;
				changeDouble -= 20.0;
			} else if (changeDouble >= 9.9) {
				tenNote++;
				changeDouble -= 10.0;
			} else if (changeDouble >= 4.9) {
				fiveNote++;
				changeDouble -= 5.0;
			} else if (changeDouble >= 1.9) {
				twoPound++;
				changeDouble -= 2.0;
			} else if (changeDouble >= 0.9) {
				onePound++;
				changeDouble -= 1.0;
			} else if (changeDouble >= 0.45) {
				fiftyPence++;
				changeDouble -= 0.5;
			} else if (changeDouble >= 0.15) {
				twentyPence++;
				changeDouble -= 0.2;
			} else if (changeDouble >= 0.08) {
				tenPence++;
				changeDouble -= 0.1;
			} else if (changeDouble >= 0.045) {
				fivePence++;
				changeDouble -= 0.05;
			} else if (changeDouble >= 0.015) {
				twoPence++;
				changeDouble -= 0.02;
			} else if (changeDouble >= 0.005) {
				onePence++;
				changeDouble -= 0.01;
			} else {
				changeDouble = 0;
			}
			System.out.println(changeDouble);
		}
		
		System.out.println("Total change due is: ");
		
		if (twentyNote > 0) {
			System.out.println(twentyNote + "x £20 note");
		}
		if (tenNote > 0) {
			System.out.println(tenNote + "x £10 note");
		}
		if (fiveNote > 0) {
			System.out.println(fiveNote + "x £5 note");
		}
		if (twoPound > 0) {
			System.out.println(twoPound + "x £2 note");
		}
		if (onePound > 0) {
			System.out.println(onePound + "x £1 note");
		}
		if (fiftyPence > 0) {
			System.out.println(fiftyPence + "x 50p");
		}
		if (twentyPence > 0) {
			System.out.println(twentyPence + "x 20p");
		}
		if (tenPence > 0) {
			System.out.println(tenPence + "x 10p");
		}
		if (fivePence > 0) {
			System.out.println(fivePence + "x 5p");
		}
		if (twoPence > 0) {
			System.out.println(twoPence + "x 2p");
		}
		if (onePence > 0) {
			System.out.println(onePence + "x 1p");
		}
		
	}

}
