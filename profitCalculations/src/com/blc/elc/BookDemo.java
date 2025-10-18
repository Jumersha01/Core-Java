package com.blc.elc;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Title :");
		String title = sc.nextLine();
		
		System.out.print("Author :");
		String author= sc.nextLine();
		
		System.out.print("Price :");
	double price = Double.parseDouble(sc.nextLine());
	
	double discount = Double.parseDouble(sc.nextLine());
	
	Book b1 = new Book(title,author,price);
	System.out.print("Enter the descount :");
	b1.applyDiscount(discount);
		
	}

}
