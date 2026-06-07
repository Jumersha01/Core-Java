package com.junaid.string_logicals;

public class ContainsDigits {
 void main() {
	 String str = "AB12CD34";
	 String digits ="";
	 
	 for(int i =0;i<str.length();i++)
	 {
		 char ch = str.charAt(i);
		  
		 if(Character.isDigit(ch)) {
			 digits+=ch;
		 }
				 
	 }
	 IO.println("Digits are : "+digits);
	 
    
 }
}
