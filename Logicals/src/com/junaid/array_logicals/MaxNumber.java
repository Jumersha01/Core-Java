package com.junaid.array_logicals;

public class MaxNumber {
	void main() {
		int size = Integer.parseInt(IO.readln("Enter the size of the array: "));

		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(IO.readln("Enter the " + (i + 1) + "th element: "));
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		IO.println("Max number found : " + max);

//		for (int i = 1; i < arr.length; i++) {
//		}
		IO.println("Min number found : " + min);

	}
}
