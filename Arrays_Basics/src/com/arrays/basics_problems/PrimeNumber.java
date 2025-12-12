package com.arrays.basics_problems;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = sc.nextInt();

		if (size <= 0) {
			System.out.println("Invalid Array size.");
			System.exit(0);
		}

		int arr[] = new int[size];
		int c = 0;

		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1) + ":");
			arr[i] = sc.nextInt();

			int count = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}

			if (count == 2) { // prime
				c++;
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println(); // newline
		if (c == 0) {
			System.out.println("No Prime Numbers Found.");
		}

		sc.close();
	}
}
