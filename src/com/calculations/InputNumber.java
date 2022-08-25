package com.calculations;
import java.util.Scanner;

public class InputNumber {
	
	public static int takingNumber() {
		int num1=0;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			try {
				num1 = Integer.parseInt(sc.next());
			} catch (java.lang.NumberFormatException e) {
				System.out.println("Enter integers only. You entered the wrong input");
				num1 = takingNumber();
			}
	
		return num1;
	}
	
}
