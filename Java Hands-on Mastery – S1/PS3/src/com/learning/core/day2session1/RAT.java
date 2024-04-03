package com.learning.core.day2session1;

import java.util.Scanner;

public class RAT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	System.out.println("enter number: ");
		for (int i = 0; i <= 5; i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}

}
