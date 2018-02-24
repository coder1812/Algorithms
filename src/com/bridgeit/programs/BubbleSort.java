package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class BubbleSort {

public static void main(String args[]) {
		
		int length,i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		length=scanner.nextInt();
		System.out.println("Enter the elements in array");
		int array[]=new int[length];
		for(i=0;i<length;i++)
		array[i]=scanner.nextInt();
	    Utility.bubble(array,length);
	    scanner.close();
		
		
		
		
		}
}
