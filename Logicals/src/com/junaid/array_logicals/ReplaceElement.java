package com.junaid.array_logicals;

import java.util.Arrays;

public class ReplaceElement {
	void main() {
		int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int count = removeDuplicates(arr);
		IO.println(count);
	}

	public static int removeDuplicates(int[] nums) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					nums[i]=nums[j];
				}
			}
			
		}
		IO.println(Arrays.toString(nums));
		return count;
	}
}
