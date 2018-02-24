package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class Anagram {

	public static void main(String args[]) {
		String string1,string2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string");
		string1=scanner.nextLine();
		System.out.println("Enter another string");
		string2=scanner.nextLine();
		Utility.anagram1(string1,string2);
		scanner.close();
	}
	}
