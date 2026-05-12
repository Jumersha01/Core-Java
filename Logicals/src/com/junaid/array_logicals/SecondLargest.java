package com.junaid.array_logicals;

public class SecondLargest {
 public static void main(String[] args) {
	 int arr[] = {12,0,5,1100,90,30,1200,4};
	 
	 int largest =arr[0];
	 int second=arr[0];
	  
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]>largest) {
			 second=largest;
			 largest=arr[i];
		 }
		
	 }
	 IO.println(largest+":"+second);
	 
 }
 
}
