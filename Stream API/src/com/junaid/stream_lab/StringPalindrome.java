//WAP to filter Palindrome Words from an Array.
//
//String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
//
//Output : Palindrome Words: [madam, racecar, level]

package com.junaid.stream_lab;

import java.util.Arrays;

public class StringPalindrome {
void main() {
	String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
	  Object arr[]=Arrays.stream(words).filter(ele->palindrom(ele)).toArray();
	  IO.print("Palindrom Words: "+Arrays.toString(arr));
	
	
}
public boolean palindrom(String names) {
  boolean isPalindrom = false;
  String reversed = "";
  
     for(int i = names.length()-1;i>=0;i--) {
    	    reversed+=names.charAt(i);
     }
     if(names.equals(reversed))
    	     isPalindrom=true;
	
	return isPalindrom;
	
}
}
