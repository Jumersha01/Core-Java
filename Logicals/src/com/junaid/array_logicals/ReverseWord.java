package com.junaid.array_logicals;

public class ReverseWord {
void main() {
	String sentence ="Hellow welcome to the Java";
	String  words[]= sentence.split(" ");
	
	for(int i =0;i<words.length;i++) {
		 for( int j =words[i].length()-1;j>=0;j--) {
			 IO.print(words[i].charAt(j));
		 }
		 IO.println();
		
	}
	
	
}
}
