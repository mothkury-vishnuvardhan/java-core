package com.learning.core.day2session1;

import java.util.Scanner;

public class WeekDay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//for (int i = 0; i < 3; i++) {
			System.out.println("Enter the numbers: ");
			int input= sc.nextInt();
			String weekday = null;
			if(input==1) {
				weekday="sunday";
			}else if(input== 2){
				weekday=" monday";
			}
			else if(input== 3){
				weekday="Tuesday ";
			}
			else if(input==4 ){
				weekday="wednesday ";
			}
			else if(input==5 ){
				weekday="thursday ";
				
			}
			else if(input== 6){
				weekday="friday ";
			}
			else if(input==7 ){
				weekday="saturday ";
			}else {
				System.out.println("Invaid");
			}
			System.out.println("weekday: " +weekday);
		}
		
	}


