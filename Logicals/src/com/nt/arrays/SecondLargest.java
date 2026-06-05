package com.nt.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = {12,13,9,11};
	
		IO.println("Second largest: "+getSecondLargest(arr));
	}
	
	public static int getSecondLargest(int arr[]) {
		
		int largest=arr[0];
		int second=arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>largest) {
				second = largest;
				largest = arr[i];
			}
			else if(arr[i]>second&&arr[i]!=largest) {
				second=arr[i];
			}
		}
		
		
		return second;
	}
	

}
