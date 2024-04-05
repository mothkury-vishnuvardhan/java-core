package com.learning.core.day2session1;

import java.util.Scanner;

public class StudentMarks {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int percentage =sc.nextInt();
		 char Grade='F';
		if(percentage>=60) {
			Grade ='A';	
		}
		else if(percentage>=45) {
				Grade='B';
			}
				else if(percentage>=35){
					Grade='C';
				}
			
						
		System.out.println("grade: "+Grade);

}}
