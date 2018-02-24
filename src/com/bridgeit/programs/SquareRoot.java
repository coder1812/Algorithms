package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String args[]) {
		
		int squareroot;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value");
		squareroot=scanner.nextInt();
		Utility.squareroot(squareroot);
		scanner.close();

}
}
