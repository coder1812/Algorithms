package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
import java.util.Scanner;

public class PermutationOfString {
	
public static void main(String args[]) {
	String string;
	int length;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string");
	string=scanner.nextLine();
	length=string.length();
	Utility.permutation(string,0,length-1);
	scanner.close();
	
}
}
