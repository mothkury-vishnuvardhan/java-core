package com.learning.core.day2session2;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		
		int arr[]= {10,5,3,3,5,6};
		
		int FirstRepeating=-1;
		for (int i = 0; i <= arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					FirstRepeating=i;
					break;
					
				}
			}
			if(FirstRepeating!=-1) {
				break;
			}
		
	}
		if(FirstRepeating!=-1) {
			System.out.println(" repeating=: "+FirstRepeating);
		}else {
			System.out.println("no repeating");
		}
	}
}
