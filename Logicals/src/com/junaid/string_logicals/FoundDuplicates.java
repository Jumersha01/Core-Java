package com.junaid.string_logicals;

import java.util.HashSet;
import java.util.Set;

public class FoundDuplicates {
 void main() {
	 String word ="Manersn";
	 int count = word.toCharArray().length-1;
	 
	 for(int i =0;i<word.length()-1;i++) {
		 int count1 = 0;
		 if(word.charAt(i)==word.charAt(count--)) {
			count1++; 
		 }
		 if(count1>=2) {
			 System.out.println(word.charAt(i));
		 }
	 
//	 Set<Character> seen = new HashSet<>();
//	 Set<Character> duplicate = new HashSet<>();
//	 
//	 for(Character ch:word.toCharArray()) {
//		 
//		 if(!seen.add(ch)) {
//			duplicate.add(ch); 
//		 }
//		 
//		 
//	 }
//	 duplicate.forEach(System.out::println);
		 
	 }			 
	 
 }
}
