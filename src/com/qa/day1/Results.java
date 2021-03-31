package com.qa.day1;

public class Results {
	
	int physics;
	int chemistry;
	int bioligy;
	int total;
	double percentage;
	
	
	public static void examResults(int physics, int chemistry, int bioligy) {
		
		System.out.println("Pyhsics: " + (int)physics + 
				": Chemistry " + (int)chemistry + " Bioligy: " +(int)bioligy);
		//format("double : %.2f", input); // 3.14
		
		int sum = physics + chemistry + bioligy;
		double percentage = 100*(((float)sum/3)/150);
		System.out.format("Percentage: %.2f", percentage);
	} 
}
