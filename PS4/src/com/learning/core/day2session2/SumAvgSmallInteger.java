package com.learning.core.day2session2;

public class SumAvgSmallInteger {
	public static void main(String[] args) {
		int A[]= { 3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		
		//sum
		int sum=0;
		
		for( int i=0;i<15;i++) {
			sum=sum+A[i];
		}
			A[15]=sum;
		double average= (double)sum/18;
		A[16]=(int)average;
		
		//smallest 
		
		int x=A[0];
		for (int i = 0; i < 18; i++) {
			if(x >A[i]) {
				x=A[i];
		}
	}
		A[17]=x;
		for (int i = 0; i < 18; i++) {
			System.out.print(A[i] +" ");
			
		}
	}
}
