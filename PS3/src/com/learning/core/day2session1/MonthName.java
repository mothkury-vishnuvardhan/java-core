package com.learning.core.day2session1;

import java.util.Scanner;

public class MonthName {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			
				System.out.println("Enter the number : ");
				
		int number=in.nextInt();
		String monthName;
		switch(number){
			case 1: monthName=" January";
			break;
			case 2: monthName=" Febuary ";
			break;
			case 3: monthName="March ";
			break;
			case 4: monthName="April ";
			break;
			case 5: monthName="may ";
			break;
			case 6: monthName="june ";
			break;
			case 7: monthName="july ";
			break;
			case 8: monthName=" August";
			break;
			case 9: monthName="September ";
			break;
			case 10: monthName="october ";
			break;
			case 11: monthName=" November";
			break;
			case 12: monthName=" December";
			break;
			 
			default:
				monthName="Invalid input";
			
		}
		System.out.println(monthName);
				
		
		}
	}

}

