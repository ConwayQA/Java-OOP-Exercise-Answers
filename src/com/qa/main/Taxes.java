package com.qa.main;

public class Taxes {
	
	public void callMethod() {
		
		double yearlySalary = 32000;
		System.out.println("Your yearly salary is: £" + yearlySalary);
		System.out.println("Your tax percentage is: " + (calculateTaxPercentage(yearlySalary)) + "%");
		System.out.println("The ammount you pay on tax a year is: £" + calculateTaxPayment(yearlySalary));
		
	}
	
	public int calculateTaxPercentage(double salary) {
		
		if (salary < 15000) {
			return 0;
		} else if (salary < 20000) {
			return 10;
		} else if (salary < 30000) {
			return 15;
		} else if (salary < 45000) {
			return 20;
		} else {
			return 25;
		}
	}
	
	public double calculateTaxPayment(double salary) {
		
		return (salary / calculateTaxPercentage(salary));
		
	}

}
