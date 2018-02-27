package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class QuestionToFindNumber {
	public static void main(String args[])
{
		int result,number,target;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number ");
		number=scanner.nextInt();
		System.out.println("Enter the target");
		target=scanner.nextInt();
		result=Utility.questionToFindNumber(number, target);
			if(result==-1)
			{
				System.out.println("Not found");
			}
			else 
			{
				System.out.println("Found at index" +result);
			}
		scanner.close();	
}
	


































}

