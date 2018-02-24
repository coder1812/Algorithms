package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class MonthlyPayment {

	public static void main(String args[]) {
	
	double Principle,Years,Rate;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Principle amount" +args[0]);
	Principle= Double.parseDouble(args[0]);
	System.out.println("Enter the year" +args[1]);
	Years= Double.parseDouble(args[1]);
	System.out.println("Enter the rate in percentage" +args[2]);
	Rate= Double.parseDouble(args[2]);
	Utility.monthlyPayment(Principle,Years,Rate);
	scanner.close();
}
}