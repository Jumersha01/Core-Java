package com.junaid.array_logicals;

public class FindThePrime {
public static void main (String [] args) {
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	
	int sum = 0;
	System.out.print("Prime No:");
	for(int i =0;i<arr.length;i++) {
		
		int count =0;
		 for(int j=1;j<=arr[i];j++) {
			 
			if(arr[i]%j==0) {
				count++;
				
			}
		 }
		 if(count==2) {
			 sum+=arr[i];
			 System.out.print(arr[i]+" ");
			
		 }
	}
	System.out.println("\nSum of prime: "+sum);
	
}
}
