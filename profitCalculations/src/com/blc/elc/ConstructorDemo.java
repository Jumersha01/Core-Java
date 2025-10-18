package com.blc.elc;

import java.util.Scanner;

public class ConstructorDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Car Model : ");
		String model = sc.nextLine();
		
		System.out.print("Enter Car Manufacturint Year : ");
	    int year = Integer.parseInt(sc.nextLine());
	    
	    System.out.print("Enter Car Price : ");
	    double price = Double.parseDouble(sc.nextLine());
		Car c1 = new Car(model,year,price);
		
	   System.out.println( c1.toString());
	}
	
}
