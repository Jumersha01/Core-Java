package com.nt.arrays;

public class Largest {

	public static void main(String[] args) {
		int arr[] = {200,12,13,9,11,102};
	  IO.println("Largest Element: "+getLargest(arr));
	}
	
	public static int getLargest(int arr[]) {
		int largest = arr[0];
		
	  for(int i=0;i<arr.length;i++) {
		  
		 if(arr[i]>largest) {
			 largest = arr[i];
		 }
		  
	  }
	  return largest;
		
	}

}
