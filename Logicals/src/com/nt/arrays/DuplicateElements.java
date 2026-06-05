package com.nt.arrays;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {

	public static void main(String[] args) {
		int arr[] = { 12, 12, 1, 2, 5, 67, 8,12,5 ,8, 4, 11, 10, 11 };
		removeDuplicate(arr);
	}

	

		public static void removeDuplicate(int arr[]) {

		    for (int i = 0; i < arr.length; i++) {

		        boolean isDuplicate = false;

		        for (int j = 0; j < i; j++) {

		            if (arr[i] == arr[j]) {
		                isDuplicate = true;
		                break;
		            }
		        }

		        
		        if (!isDuplicate) {
		            System.out.print(arr[i] + " ");
		        }
		    }
		
		
	}

}
