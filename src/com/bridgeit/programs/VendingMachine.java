package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class VendingMachine {
public static void main(String args[]) {
		
		int amount;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the amount");
		amount=scanner.nextInt();
	    Utility.vendingMachine(amount);
	    scanner.close();	
	
}		
}