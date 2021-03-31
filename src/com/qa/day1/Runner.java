package com.qa.day1;

public class Runner {

	public static void main(String[] args) {
		
		int add = Calculator.addition(5, 2);
		int multiply = Calculator.multiplication(5, 2);
		int subtract = Calculator.subtraction(5, 2);
		double divide = Calculator.division(5, 2);
		System.out.println(add);
		System.out.println(multiply);
		System.out.println(subtract);
		System.out.println(divide);
		
		//Results.examResults(135, 125, 100);

	}

}
