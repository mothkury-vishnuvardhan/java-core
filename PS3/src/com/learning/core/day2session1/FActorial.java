package com.learning.core.day2session1;

import java.util.Scanner;

public class FActorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		int factorial =1;
		for (int i = 1; i <= n; i++) {
			factorial= factorial*i;
			
			
		}
		System.out.println("FActorial of: "  + n + "is"+   factorial);
		
	}

}
