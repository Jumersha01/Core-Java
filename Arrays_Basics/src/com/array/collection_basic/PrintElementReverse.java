/*
 * Print all elements in reverse order of an Array.

Input as: 1 2 3 4 5
Output as: 5 4 3 2 1

 */

package com.array.collection_basic;

public class PrintElementReverse {

	public static void main(String[] args) {
		int size = Integer.parseInt(IO.readln("Enter size of the Array: "));
		int arr[] = new int[size];
		
		for(int i= 0;i<size;i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter "+(i+1)+" th element: "));
			
		}
		IO.println("Reversed Array:");
		
		for(int i =arr.length-1;i>=0;i--) {
			IO.print(" "+arr[i]);
		}
	}

}
