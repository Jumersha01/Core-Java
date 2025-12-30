/*
 * Write a java program to find the middle elements of a given array. 
If array is odd then print only the middle element, if array is even
then print both the middle elements.

Input as : 1 2 3 4 5     
Output is : 3

Input is :1 2 3 4 5 6    
Output is :3 4
 */

package com.array.collection_basic;

public class PrintMiddleElement {

	public static void main(String[] args) {
		int size = Integer.parseInt(IO.readln("Enter size of the Array: "));
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter " + (i + 1) + " th element: "));

		}

		if ((arr.length) % 2 == 0) {
			IO.println(arr[(arr.length - 1) / 2] + " " + arr[((arr.length - 1) / 2) + 1]);
		} else {
			IO.println(arr[(arr.length - 1) / 2]);
		}

	}

}
