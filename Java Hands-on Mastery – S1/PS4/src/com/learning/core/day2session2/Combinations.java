package com.learning.core.day2session2;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the values of n: ");
		int n=sc.nextInt();
		
		System.out.print("enter the array of numbers: ");
		String num=sc.next();
		
		int arr[]=new int[num.length()];
		for(int i=0;i< num.length();i++) {
			arr[i]=Character.getNumericValue(num.charAt(i));
			
		}
		System.out.println("Distinct combinations: ");
		
		generateCOmbinations(arr, n, "",0);
		sc.close();
	}
	private static void generateCOmbinations(int arr[],int n, String current,int start) {
		if(current.length()==n) {
			System.out.println(current + " ");
			return;
		}
		
		for (int i = start; i < arr.length; i++) {
			generateCOmbinations(arr, n,current + arr[i],i +1);
		}
		
	}

}
