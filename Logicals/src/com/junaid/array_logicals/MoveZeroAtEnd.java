package com.junaid.array_logicals;

import java.util.Arrays;

public class MoveZeroAtEnd {
void main() {
	int arr[]= {5,0,7,0,6,0,10,0,11,44,8};
	
	for(int i =0;i<arr.length;i++) {
		   for(int j =i+1;j<arr.length;j++) {
			   if(arr[i]==0) {
				   int temp = arr[j];
				   arr[j]=arr[i];
				   arr[i]=temp;
			   }
		   }
		   
	}
	IO.println(Arrays.toString(arr));
}
}
