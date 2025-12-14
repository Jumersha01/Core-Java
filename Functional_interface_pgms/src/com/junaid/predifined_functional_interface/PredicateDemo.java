package com.junaid.predifined_functional_interface;

import java.util.function.Predicate;

public class PredicateDemo {

	void main() {
		Predicate<Integer> isEven = num-> num%2==0;
	  
		 int  num  = Integer.parseInt(IO.readln("Enter the Number : "));
		 if(num<0) {
			System.err.println("Number cant be less than zero");
			 System.exit(0);
		 }
		 
		 if(isEven.test(num)) {
			 IO.println("The number : "+num+" is Even");
		 }
		 else {
			 IO.println("The number : "+num+" is Odd");
		 }
		
	}
}
