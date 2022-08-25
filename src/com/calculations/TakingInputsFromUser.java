package com.calculations;

import java.util.Scanner;

public class TakingInputsFromUser {
	
public static void takingInputs(String proceedStatus) {
		Scanner sc = new Scanner(System.in);
		if(proceedStatus.equals("yes")) {
			//taking 2 numbers
			int num1 = InputNumber.takingNumber();
			int num2 = InputNumber.takingNumber();
			
			//taking the option
			System.out.println("Operations:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
			int option = Option.takingOptions();
			
			//performing the operations
			Calculator.operations(option, num1, num2);
	
			//asking the user to use this application again or not
			System.out.println("Do you want to agian use the calculator?(yes|no):");
			proceedStatus = sc.next();
			while(proceedStatus.equalsIgnoreCase("yes")==false && proceedStatus.equalsIgnoreCase("no")==false){
				System.out.println("Enter correct option(yes|no):");
				proceedStatus = sc.next();
			}
			takingInputs(proceedStatus);
			
		}else {
			System.out.println("-------------Thank you for using the application------------");
		}
	}
}
