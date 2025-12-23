/*Assignment 02
==============

Handling ArithmeticException 

Objective:
Write a Java program that demonstrates how to handle ArithmeticException. 
The program should include a method that performs division and throws an ArithmeticException if division by zero occurs. 
Implement exception handling in the main method to catch and handle this exception.

Instructions:
-------------

-> Create a class named DivisionExample:

-> Implement a static method performDivision :
   Takes two integer parameters: dividend and divisor.
   Access Modifier : public
   Non-Access Modifier : static
   return type : int
   parameters : int, int

-> Performs division operation (dividend / divisor).
   Throws an ArithmeticException if divisor is zero.

-> Implement the main method:
   Inside the main method, call the performDivision method with different inputs, including zero as a divisor.
   Use a try-catch block to catch and handle any ArithmeticException thrown by performDivision method.
   Print an appropriate error message when division by zero occurs.



TEST CASE 1 :
------------
Input as : 
Enter dividend : 10
Enter divisor : 2

Output as :
Result of division : 5


TEST CASE 2 : 
-------------
Input as : 
Enter dividend : 5
Enter divisor : 0

 * */

package com.junaid.exception_handellig_basics;

public class DivisionExample {

	public static void main(String[] args) {
		int divident = 0;
		int divisor = 0;
		try {
			divident = Integer.parseInt(IO.readln("Enter divident: "));
			divisor = Integer.parseInt(IO.readln("Enter the divisor: "));

			IO.println("Result of division : " + performDivision(divident, divisor));
		} catch (ArithmeticException e) {
			IO.println(
					"ArithmeticException Cought: devision by zero: divident = " + divident + ", divisor = " + divisor);
		}
	}

	public static int performDivision(int divident, int divisor) throws ArithmeticException {
		return divident / divisor;
	}
}
