package com.qa.main;

public class Results {
	
	public void callMethod() {
		//Edit values below to match students scores to their corresponding subjects
				int physics = 40;
				int chemistry = 80;
				int biology = 40;
				
				//Run exam results overview output
				scoreOverview(physics, chemistry, biology);
				
				//run total exam percentage
				scorePercentage(physics, chemistry, biology);
	}
	
	//Outputs the users individual scores as well as the calculated sum of their scores.
	public void scoreOverview(int phys, int chem, int bio) {
		int totalScore = phys + chem + bio;
		
		System.out.println("Your individual scores for each subject are as follows:");
		System.out.println("Physics: " + phys + "/150");
		System.out.println("Chemistry: " + chem + "/150");
		System.out.println("Biology: " + bio + "/150");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Total Score: " + totalScore + "/450");
		System.out.println("---------------------------------------------------------------------------------------");
		
	}
	
	//Outputs the users percentage completion overall
	public void scorePercentage(int phys, int chem, int bio) {
		int totalScore = phys + chem + bio;
		int percentage = (totalScore * 100) / 450;
		int physPercentage = (phys * 100) / 150;
		int chemPercentage = (chem * 100) / 150;
		int bioPercentage = (bio * 100) / 150;
		
		String failClass = "";
		
		if (physPercentage <= 60) {
			failClass += " Physics";
		}
		if (chemPercentage <= 60) {
			failClass += " Chemistry";
		}
		if (bioPercentage <= 60) {
			failClass += " Biology";
		}
		
		System.out.println("Your overall percentage: " + percentage + "%");
		System.out.println("---------------------------------------------------------------------------------------");
		
		if (percentage >= 60 && physPercentage >= 60 && chemPercentage >= 60 && bioPercentage >= 60) {
			System.out.println("Congratulations! You passed!");
		} else {
			System.out.println("Unfortunately, you have failed...");
			System.out.println("You have failed in these subjects: " + failClass);
		}
		
		
	}
}
