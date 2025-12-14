package com.junaid.predifined_functional_interface;

import java.util.function.Function;

public class FunctionalDemo {
 
void main() {
	Function<Double,String> result = marks-> {
		if(marks>80) {
			return "Passed in Distinction";
		}
		else if(marks<80&&marks>65) {
			return "Passed in B grade";
		}
		else if(marks<60&&marks>50) {
			return "Passed in c grade";
		}
		else {
			return "Fail";
		}
	};
	
	double marks = Double.parseDouble(IO.readln("Enter the marks you got: "));
	IO.println(result.apply(marks));
}
	 
}
