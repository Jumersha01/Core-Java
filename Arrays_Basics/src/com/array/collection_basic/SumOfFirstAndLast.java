/*
 * Write a java program to add the last and first element of a given array.
Input as: [1,2,3,4,5,6]   
Output as: 7
 */

package com.array.collection_basic;

public class SumOfFirstAndLast {

	public static void main(String[] args) {
		int size = Integer.parseInt(IO.readln("Enter size of the Array: "));
		int arr[] = new int[size];
		int sum =0;
		
		for(int i= 0;i<size;i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter "+(i+1)+" th element: "));
			
		}
		
		sum +=(arr[0])+(arr[arr.length-1]);
		IO.println("Sum of first and last index is: "+sum);

	}

}
