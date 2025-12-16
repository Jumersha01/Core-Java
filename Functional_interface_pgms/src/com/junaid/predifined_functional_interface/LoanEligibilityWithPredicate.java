
/*Develop a scenario based program by using Functional interface to check whether a customer 
is eligible for loan or not.

Create one record called Customer.
Components :
 name : String
 salary : Double
 creditScore : Integer
 age : Integer

Method :

1) Method Name     : checkLoanEligibility()
parameter          : No parameter
Return Type        : boolean
Access modifier    : public

In this method by using Predicate<Customer> verify whether a customer is eligible for
loan or not by using following criteria :

a) Customer salary should be > 25000
b) Credit Score should be > 700
c) Age must be > 21

By using Logical AND operator verify all the criteria and return true/false.


Take an ELC class LoanEligibilityWithPredicate with main method, With the help of IO
class create the input data, create the object for Customer class and verify whether the 
customer is eligible for loan or not.*/

package com.junaid.predifined_functional_interface;

import java.util.function.Predicate;

public class LoanEligibilityWithPredicate {

	public static void main(String[] args) {
		String name = IO.readln("Enter the name :");
		double salary = Double.parseDouble(IO.readln("Enter the salary : "));
		int score = Integer.parseInt(IO.readln("Enter the credit Score: "));
		int age = Integer.parseInt(IO.readln("Enter the age: "));

		Customer customer = new Customer(name, salary, score, age);
		if (customer.checkLoanEligibility()) {

			IO.readln("Customer is eligble for the Loan");
		} else {
			IO.readln("Customer is not eligble for the Loan");
		}

	}

	
}
