/*
 * Write a java program to print all even elements and odd elements 
separately from an array.

Input as  : 1 2 3 4 5 6 7
Even elements are : 2 4 6
Odd elements are : 1 3 5 7
 */

package com.array.collection_basic;

public class EvenAndOdd {

	public static void main(String[] args) {
		int size = Integer.parseInt(IO.readln("Enter size of the Array: "));
		int arr[] = new int[size];
		
		for(int i= 0;i<size;i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter "+(i+1)+" th element: "));
			
		}
		String even = "";
		String odd  ="";
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even+=" "+(arr[i]);
			}
			else {
				odd+=" "+(arr[i]);
			}
		}
		
		IO.println("Even Elements are: \n"+even);
		IO.println("Odd Elements are: \n"+odd);
		
	}

}
