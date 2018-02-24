package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class QuestionToFindNumber {
	public static void main(String args[])
{
		int result,number,j,i,target,count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number ");
		number=scanner.nextInt();
		System.out.println("Enter the target");
		target=scanner.nextInt();
		while(number>0)
		{
			if(number==1)
			{
				break;
			}
			else
			{
			   number=number/2;
			   count++;
			}
		}
		int array[]=new int[number];
		for(i=0,j=1;i<number;i++,j++) {
			array[i]=j;
			
		}
		
		result=Utility.questionToFindNumber(array,target,0,number-1,count);
			if(result==-1)
			{
				System.out.println("Not found");
			}
			else {
				System.out.println("Found at index" +result);
			}
	scanner.close();	
}
	


































}

