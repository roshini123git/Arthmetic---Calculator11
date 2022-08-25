package com.calculations;
import java.util.Scanner;

public class Option {
	public static int takingOptions() {
		Scanner sc = new Scanner(System.in);
		int option = 0;

			try {
				System.out.println("Enter the operation to be performed(1|2|3|4):");
				option = sc.nextInt();
				
			} catch (java.util.InputMismatchException e) {
				System.out.println("-----Enter Intergers only-----");
				option = takingOptions();
			}
		
		if(option!=1 && option!=2 && option!=3 && option!=4) {
			System.out.println("-----Enter Integers in the range of 1 to 4 only-----");
			option = takingOptions();
		}
		return option;
	}
}
