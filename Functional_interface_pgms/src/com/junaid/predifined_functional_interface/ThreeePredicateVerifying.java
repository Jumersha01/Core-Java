/*Assignment 01 :
---------------
Write a Java program that defines a method testPredicate to test a given number against a provided predicate.
class name CalculationLogic(ELC) :

Method name : testPredicate
Access Modifier : public
Non-Access Modifier : static
return type : boolean
parameters : int, Predicate<Integer>
This method should return a boolean value indicating whether the given number satisfies the provided predicate.


In the main method:
Define three predicates:
isEven: Checks if a given number is even.
isGreaterThanTen: Checks if a given number is greater than 10.
isPrime: Verify the given number is prime or not.

Define a sample integer number (e.g., 18).
Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.

*/
package com.junaid.predifined_functional_interface;

import java.util.function.Predicate;

class TestPredicate{
	static boolean testPredicate(int num,Predicate<Integer> p) {
		return p.test(num);
	}
}
public class ThreeePredicateVerifying {

	public static void main(String[] args) {
		int num = Integer.parseInt(IO.readln("Enter the number :"));
		Predicate<Integer> isEven = nums->nums%2==0;
		 Predicate<Integer> isBig = numss->numss>10;
		 
		Predicate<Integer> isPrime = prime->{
			boolean isvalid = false;
			for(int i = 2;i<=prime/2;i++) {
				int count = 0;
				if(prime%i==0) {
					return false;
				}
				
			}
			return true;
			
			
		};
		
	
		
		IO.println("The number is Even: "+TestPredicate.testPredicate(num,isEven));
		IO.println("The number is Big: "+TestPredicate.testPredicate(num,isBig));
		IO.println("The number is prime: "+TestPredicate.testPredicate(num,isPrime));
	}

}
