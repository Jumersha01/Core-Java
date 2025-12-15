package com.junaid.predifined_functional_interface;

import java.util.function.Predicate;

public class TwoPredicate {

	void main() {

		int num = Integer.parseInt(IO.readln("Enter the Number : "));

		Predicate<Integer> isEven = num1 -> num1 % 2 == 0;

		Predicate<Integer> isBig = num2 -> num2 > 10;
		
		boolean isSatisfies = false;
		if (isEven.test(num) && isBig.test(num)) {
			isSatisfies =true;
			IO.println("Number satisfies both predicates: "+isSatisfies);
		} else {
			
			IO.println("Number satisfies both predicates: "+isSatisfies );
		}

	}
}
