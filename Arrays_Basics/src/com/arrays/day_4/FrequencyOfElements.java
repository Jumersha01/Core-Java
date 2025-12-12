package com.arrays.day_4;

import java.util.*;

public class FrequencyOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of an Array");
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Invalid Array Size");
			System.exit(0);
		}
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the " + i + "th element");
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			int count = 1;
			for (int k = j + 1; k < arr.length; k++) {
				if (arr[j] == arr[k] && arr[j] != '*') {
					count++;
					arr[k] = '*';
				}
			}
			if (arr[j] != '*') {
				System.out.println("Element: " + arr[j] + ", Frequency: " + count);
			}

		}

	}
}
