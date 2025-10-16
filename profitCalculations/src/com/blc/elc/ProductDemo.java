package com.blc.elc;

import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Product ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Product Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Product Price: ");
		double price = Double.parseDouble(sc.nextLine());
		
		p1.setProductDetails(id, name, price);
		
		System.out.println("----- Product Details -----");
		System.out.println(p1.toString());
		
		p1.calculateDiscount();
		
		
		
		
		
		
		

	}

}
