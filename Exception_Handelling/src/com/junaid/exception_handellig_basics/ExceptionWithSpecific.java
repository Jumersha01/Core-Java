package com.junaid.exception_handellig_basics;
// try with multiple catch block
public class ExceptionWithSpecific {
void main() {
	try {
		int num1 = Integer.parseInt(IO.readln("Enter the First Number: "));
		int num2 =Integer.parseInt(IO.readln("Enter the First Number: "));
		IO.println(num1/num2);
		
		int size = Integer.parseInt(IO.readln("Enter the size of the Array: "));
		int arr [] = new int[size];
		
		double salary = Double.parseDouble(IO.readln("Enter the Salary :"));
		
		String  str = IO.readln("Enter something here: ");
		int index = Integer.parseInt(IO.readln("Enter the String index to acces"));
		IO.println(str.charAt(index));
		
	}
	catch(ArithmeticException e) {
		System.err.println("You are Trying to devide a number by zero");
	}
	catch(NegativeArraySizeException e) {
		System.err.println("You are Trying to Give negative size to the Array");
	}
	catch(NumberFormatException e) {
	
	System.err.println("You are Trying to assign  wrong type of data : ");
	}
	catch(Exception e) {
		System.err.println("Generic Exception Occured");
	}
	
}
}
