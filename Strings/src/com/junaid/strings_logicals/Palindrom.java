package com.junaid.strings_logicals;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str  = sc.nextLine();
		boolean isPalindrom = true;
		
		for(int i =0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				isPalindrom = false;
				break;
			}
			else {
				isPalindrom =true;
			}
			
		}
		if(isPalindrom) {
			System.out.println("The String is Palindrome");
		}
		else {
			System.out.println("The String is not Palindrome");
		}
	}

}
