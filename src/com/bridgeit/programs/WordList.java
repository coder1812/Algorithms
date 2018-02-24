package com.bridgeit.programs;

import java.io.*;
import com.bridgeit.utility.Utility;

public class WordList {

	public static void main(String args[]) throws IOException {
		File file = new File("file.txt");
		String string;
	    int result;
		 
		  BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
		  System.out.println("Enter the string to be searched");
		  string=bufferedreader.readLine();
		  String[] array=string.split(" ");
		  result=Utility.binarySearch(array,string,0,array.length);
		  if(result==-1)
		  {
			  System.out.println("String not found");
		  }
		  else {
			  System.out.println("String found at index" +result);
		       }
		  
	}
}
