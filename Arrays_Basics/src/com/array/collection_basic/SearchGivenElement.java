/*
 * Que 1 :
========
Search for a given Element in an Array if present then print
"Element found at index : ", if not present print "Element not found"
    
Input as: 1 4 3 5 2 6 5
Enter searching element: 5
Output: Element found at index 3

Input as: 1 4 3 5 2 6
Enter searching element: 7
Output: Element not found
 */


package com.array.collection_basic;

public class SearchGivenElement {

	public static void main(String[] args) {
		int size = Integer.parseInt(IO.readln("Enter the size of the array: "));
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter the " + (i + 1) + " element of array : "));
		}

		int element = Integer.parseInt(IO.readln(" Enter Searching Element: "));
		boolean isFound = false;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {

				index = i;
				isFound = true;
				break;
			}

			else {
				isFound = false;
			}

		}
		if (isFound) {
			IO.println("Element found on the index: " + index);
		} else {
			IO.println("Element not found");
		}

	}
}
