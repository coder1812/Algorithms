package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class TemperatureConversion {

	
public static void main(String args[]) {
		
		int choice;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the choice 1-fahrenheit 2-celsius");
		choice=scanner.nextInt();
	    Utility.temperatureConversion(choice);
	    scanner.close();
}
}
