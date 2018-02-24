package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class ConverttoBinary {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		Utility.toBinary(number);
		scanner.close();
	}
}
