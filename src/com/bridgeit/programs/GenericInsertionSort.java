package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class GenericInsertionSort {
	public static void main(String args[]) {
		int choice;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the type of array\n1-Integer\n2-String");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Enter the length of array");
				int length1=scanner.nextInt();
				Integer array1[]=new Integer[length1];
				System.out.println("Enter the elements of array");
				for(int i=0;i<length1;i++)
				{	
					array1[i]=scanner.nextInt();
				}
				Utility.genericInsertionSort(array1);
		       break;
		case 2: System.out.println("Enter the length of array");
				int length2=scanner.nextInt();
				String array2[]=new String[length2];
				System.out.println("Enter the elements of array");
				for(int j=0;j<length2;j++)
				{
					array2[j]=scanner.nextLine();
				}
				Utility.genericInsertionSort(array2);
				break;
		default:System.out.println("Error");		
		}	
		
	}
}
