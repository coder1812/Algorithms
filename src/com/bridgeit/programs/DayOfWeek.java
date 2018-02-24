package com.bridgeit.programs;


import com.bridgeit.utility.Utility;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String args[]) {
		
			int date,month,year;
			Scanner scanner=new Scanner(System.in);
			date=Integer.parseInt(args[0]);
			month=Integer.parseInt(args[1]);
			year=Integer.parseInt(args[2]);
			Utility.dayOfWeek(date,month,year);
			scanner.close();
	
	}
	
}
