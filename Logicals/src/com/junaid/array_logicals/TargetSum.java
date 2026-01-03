package com.junaid.array_logicals;

public class TargetSum {
	void main() {

		int[] arr = { 2, 7, 4, 8, 3, 5, 1, 6 };
		int targetSum = 9;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == targetSum) {
					IO.println("(" + arr[i] + "," + arr[j] + ")");
				}
			}
		}
	}
}
