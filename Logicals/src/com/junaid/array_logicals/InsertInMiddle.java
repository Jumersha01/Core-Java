package com.junaid.array_logicals;

import java.util.Arrays;

public class InsertInMiddle {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5, 6};
		int arr2[] = new int[arr.length+1];
		
		int mid = arr.length/2;
		int ele=4;
		
		for(int i = 0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		
		for(int i = arr.length-1;i>=mid;i--) {
			arr2[i+1]=arr[i];
		}
		
		arr2[mid+1]=ele;
		IO.println(Arrays.toString(arr2));
		
		
		

	}

}
