package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.*;
public class ToBinary {
  public static void main(String args[]) {
	  
	  int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		number=scanner.nextInt();
		Utility.toBinary(number);
		scanner.close();
  }
}
