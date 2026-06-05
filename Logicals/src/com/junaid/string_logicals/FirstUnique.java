package com.junaid.string_logicals;

public class FirstUnique {

	public static void main(String[] args) {
		String word  = "AApple";
		char arr [] = word.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			int cout=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cout++;
				}
			}
			if(cout==1) {
				System.out.println(arr[i]);
				break;
			}
				
			
		}
	}

}
