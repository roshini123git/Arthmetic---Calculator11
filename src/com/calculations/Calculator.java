package com.calculations;
public class Calculator {
	public static void operations(int option, int num1, int num2) {
		switch (option) {
		case 1: 	System.out.println("Your answer is: "+(num1+num2));
					break;
		case 2:     System.out.println("Your answer is: "+(num1-num2));
					break;
		case 3:     System.out.println("Your answer is: "+(num1*num2));
					break;
		case 4:     try {
							float ans = (float)num1/num2;
							System.out.println("Your answer is "+ans);
					} catch (ArithmeticException e) {
							System.out.println("Your answer is invalid.\nDenominator cannot be Zero.");
					}
					break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}
		
}
