package com.junaid.predifined_functional_interface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
void main() {
	int a = Integer.parseInt(IO.readln("Enter a value: "));
	int b = Integer.parseInt(IO.readln("Enter b value: "));
	
	BiPredicate<Integer,Integer> bothEven = (num1,num2)-> (num1%2==0)&&(num2%2==0);
	IO.println("Is Both numbers even :"+ bothEven.test(a,b));
}
}
