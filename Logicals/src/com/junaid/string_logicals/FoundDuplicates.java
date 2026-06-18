package com.junaid.string_logicals;

import java.util.HashSet;
import java.util.Set;

public class FoundDuplicates {
 void main() {
	 String word ="Manersn";
	 for(int i =0;i<word.length()-1;i++) {
		 int count = 1;
		 if(word.charAt(i)==word.charAt(i+1)) {
			 count++;
		 }
		 if(count>1) {
			 System.out.println(word.charAt(i)+" : "+count);
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
