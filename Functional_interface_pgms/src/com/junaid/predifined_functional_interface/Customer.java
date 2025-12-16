package com.junaid.predifined_functional_interface;

import java.util.function.Predicate;

public record Customer(String name,Double salary,Integer creditScore,Integer age) {
	
	public  boolean checkLoanEligibility() {

		Predicate<Customer> customers = custs -> (salary() > 25000 && creditScore() > 700)
				&& age() > 21;
				
				return customers.test(this)?true:false;
				
				

				
		 
	}

}
