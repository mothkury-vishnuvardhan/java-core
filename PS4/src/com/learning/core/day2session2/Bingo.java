package com.learning.core.day2session2;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		
		int array[]= {7,18,20,30,39};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		boolean bingo=false;
		for (int x : array) {
			if(x==num1 && x==num2) {
				bingo=true;
				break;
				}	
	}
		if(bingo) {
			System.out.println("bingo");
		}
		else {
			System.out.println("not found");
		}
	}

}
