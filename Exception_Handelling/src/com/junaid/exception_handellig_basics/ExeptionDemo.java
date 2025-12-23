package com.junaid.exception_handellig_basics;
//this is the basic exception of pgm 

public class ExeptionDemo {
void main() {
	try {
		int num1 = Integer.parseInt(IO.readln("Enter the First Number: "));
		int num2 =Integer.parseInt(IO.readln("Enter the First Number: "));
		IO.println(num1/num2);
	}
	catch(Exception e) {
e.printStackTrace();
	}
}
}
