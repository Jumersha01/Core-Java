package com.arrays.custom_objects;

import java.util.Scanner;

public class ProductArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		
		int n = Integer.parseInt(sc.nextLine());
		
		
		if(n<=0) {
			System.out.println("Invalid Array size");
            System.exit(0);
		    
		}
		Product product [] = new Product[n];
		
		for(int i = 0;i<n;i++) {
			System.out.println();
			System.out.println("Enter Details for product : "+(i+1));
			
			System.out.print("Enter Product ID: ");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Product Name: ");
	          String name = sc.nextLine();
	          
	      	System.out.print("Enter Product Price: ");
			double price = Double.parseDouble(sc.nextLine());
			
			product[i] = new Product(id,name,price);
			
			
			     			
		}
		System.out.print("Enter product ID to search:");
		int pIds = Integer.parseInt(sc.nextLine());
		 
		boolean isValid =false;
		for(Product p :product) {
		
			if(p.getId()==pIds) {
				

				isValid =true;
				if(isValid) {
					System.out.println(" Product Found: "+p);
				
				}
			}
			else {
				
				isValid=false;
			}
			
		}
		if(isValid==false) {
			System.out.println("Product with ID "+pIds+" not found");
			System.exit(0);
		}
		
		
		
	
		

	}

}
