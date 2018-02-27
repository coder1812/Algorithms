package com.bridgeit.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class Utility {

	public static void anagram1(String string1, String string2) {
		int count = 0;
		char[] characterarray1 = string1.toCharArray();
		char[] characterarray2 = string2.toCharArray();

		for (int i = 0; i < string1.length(); i++) {
			for (int j = 0; j < string2.length(); j++) {
				if (characterarray1[i] == characterarray2[j]) {
					count++;
				} else {

				}
			}
		}
		if (count == string1.length())
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");

	}

	public static void bubble(int array[], int length) {

		int temp = 0, i, j;
		for (i = 0; i < length - 1; i++) {
			for (j = 0; j < length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
		}
		for (i = 0; i < length; i++)
			System.out.println(array[i]);

	}

	public static void insertion(int array[], int length) {

		int i, j, temp = 0;
		for (i = 1; i < length; i++) {
			temp = array[i];
			for (j = i - 1; j >= 0 && temp < array[j]; j--)
				array[j + 1] = array[j];
			array[j + 1] = temp;

		}
		for (i = 0; i < length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void vendingMachine(int amount) {

		int i, count = 0;
		int[] array = new int[] { 1000, 500, 100, 50, 10, 5, 2, 1 };
		while (amount > 0) {
			for (i = 0; i < 8; i++) {

				if (array[i] > amount) {
					System.out.println();
				} else {
					amount = amount - array[i];
					count++;
					System.out.println("note use :" + array[i] + " count " + count);
				}
			}
		}
		// System.out.println("count= "+c);

	}

	public static void prime() {
		int n, i;
		System.out.println("2, ");
		for (n = 3; n <= 1000; n++) {
			for (i = 2; i <= 1000; i++) {
				if (n % i == 0)
					break;
				else
					System.out.print(n + " , ");
				break;
			}
		}
	}

	public static void temperatureConversion(int choice)

	{
		Scanner scanner = new Scanner(System.in);
		double temp, TEMP, celsius, fahrenheit;
		switch (choice) {
		case 1:
			System.out.println(" Enter Temperature-");
			temp = scanner.nextDouble();
			celsius = ((temp - 32) * 5 / 9);
			System.out.println("Temperature in celsius is " + celsius);
			break;
		case 2:
			System.out.println("Enter the temperature");
			TEMP = scanner.nextDouble();
			fahrenheit = ((TEMP * 9 / 5) + 32);
			System.out.println("Temperature in fahrenheit is " + fahrenheit);
			break;
		default:
			System.out.println("Invalid month");
			break;

		}

		scanner.close();

	}

	public static void monthlyPayment(double Principle, double Years, double Rate) {

		double pay, n, r;
		n = 12 * Years;
		r = (Rate / (12 * 100));
		pay = ((Principle * r) / (1 - Math.pow(1 + r, (-n))));
		System.out.println("Monthly payment is " + pay);

	}

	public static void dayOfWeek(int date, int month, int year) {
		int yo, mo, x, dd;
		yo = (int) (((year - (14 - month)) / 12));
		x = (int) yo + yo / 4 - yo / 100 + yo / 400;
		mo = (int) ((month + 12) * ((14 - month) / 12) - 2);
		dd = (int) (((date + x + (31 * mo)) / 12) % 7);
		switch (dd) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Check calculation");
		}

	}

	public static void squareroot(int squareroot) {
		double result;
		double epsilon = 1e-15;
		result = squareroot;

		while (Math.abs(result - squareroot / result) > epsilon * result) {

			result = (((squareroot / result) + result) / 2);
		}
		System.out.println(result);
	}

	public static void toBinary(int number) {
		int i;
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		while (number != 0) {
			arraylist.add(number % 2);
			number /= 2;
		}
		for (i = arraylist.size() - 1; i >= 0; i--) {
			System.out.print(arraylist.get(i));
		}
		System.out.println();
		if (arraylist.get(arraylist.size() - 1) == 0) {
			System.out.print("2");
		} else {
			System.out.print("1");
		}
		int j = 1;
		for (i = arraylist.size() - 2; i >= 0; i--) {
			if (arraylist.get(i) == 0) {
				System.out.print("+" + (int) Math.pow(2, j));
				j++;

			} else {
				j++;
			}
		}
	}

	/*
	 * public void binary(int n) { tobinary(n);
	 * 
	 * 
	 * }
	 * 
	 * public static <T extends Comparable<T>> void binarySearch(T array[]) { for
	 * (int i = 0; i < array.length; i++) { System.out.println(array[i]); }
	 */

	public static int binarySearch(String string[], String target, int start, int last) {

		if (start >= last) {
			return -1;
		}

		else {
			int mid;
			mid = ((start + last) / 2);
			if (target.compareTo(string[mid]) < 0) {
				return binarySearch(string, target, 0, mid);
			} else if (target.compareTo(string[mid]) > 0) {
				return binarySearch(string, target, mid, last);
			}

			return mid;

		}
	}

	public static int questionToFindNumber(int number, int target) {

		int array[] = new int[number];
		int i, j, count = 0;
		while (number > 0) {
			if (number == 1) {
				break;
			} else {
				number = number / 2;
				count++;
			}

		}
		System.out.println(count+ " - Times");
		number = (int) Math.pow(2, number);
		int start = 0, end = array.length - 1;
		boolean flag = false;
		for (i = 0, j = 1; i < number; i++, j++) {
			array[i] = j;
		}
		while (start <= end) {
			int mid =start + (end-1) / 2;

			if (array[mid]==target) 
			{
				return mid;
			}
			if (array[mid]>target) {
				end = mid - 1;
				flag = false;
				System.out.println(flag);
			}

			else (array[mid]<target) {
				start = mid + 1;
				flag = true;
				System.out.println(flag);
			}

		}
		return -1;
	}

	public static <T extends Comparable> void genericInsertionSort(T[] array) {

		int i, j;
		T temp1;
		for (i = 1; i < array.length; i++) {
			temp1 = array[i];
			for (j = i - 1; j >= 0 && array[j].compareTo(temp1) > 0; j--)
				array[j + 1] = array[j];
			array[j + 1] = temp1;

		}
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}
	public static <T extends Comparable> void genericBubbleSort(T[] array) {
		int  i, j;
		T temp;
		for (i = 0; i < array.length-1; i++) {
			for (j = 0; j < array.length - 1; j++) {
				if (array[j].compareTo(array[j+1])>0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
		}
		for (i = 0; i < array.length; i++)
			System.out.println(array[i]);	
	}
}
