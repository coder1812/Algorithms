
/******************************************************************************
 *  Purpose:  Sorts th element in array using MergerSort.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;
import com.bridgeit.utility.Utility;
public class MergeSort {
	
		public static void main(String args[])
		{	
			Utility utility = new Utility();
			System.out.println("Enter the array size");
			Integer n = utility.inputInteger();
			Integer arr[] = new Integer[n];
			System.out.println("Enter the array element");
			for (int i=0 ; i<arr.length ; i++)
			{
				arr[i] = utility.inputInteger();
			}
			System.out.println("Before sort:");
			utility.printArray(arr);
			utility.mergeSort(arr,0,n-1);
			System.out.println("After sort:");
			utility.printArray(arr);
			System.out.println();
			
		}
	}




