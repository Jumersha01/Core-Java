package com.junaid.strings_logicals;

import java.util.Scanner;

public class RemoverChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		
		String str = sc.nextLine();
		System.out.print("Enter the character to be REMOVED: ");
		
		char ch  = sc.nextLine().charAt(0);
		
		StringBuffer  result = new StringBuffer();
		for(int i = 0;i<str.length();i++) {
			if(ch!=str.charAt(i)) {
				result.append(str.charAt(i));
			}
			
		}
		System.out.println("String after Removing the Character : "+result);

	}

}
