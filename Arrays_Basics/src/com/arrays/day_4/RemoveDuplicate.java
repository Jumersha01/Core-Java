package com.arrays.day_4;

import java.util.*;

public class RemoveDuplicate {

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
			System.out.print("Enter the " + i + "th Element");
			arr[i] = sc.nextInt();
		}
		arr = Arrays.stream(arr).distinct().toArray();
		System.out.print("Array after removing duplicates: " + Arrays.toString(arr));

	}
}
