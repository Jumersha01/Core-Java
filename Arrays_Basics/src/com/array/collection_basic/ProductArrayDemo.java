/*
 * Que 7 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Product.

Attributes/Properties/Fields [tightly encapsulated]

id, name and price

Take a parameetrized constructor to initialize all the fields.

Take getter method for id field.

Generate toString() method.

Take an ELC class called ProductArrayDemo with main method.

Create Scanner class object to initialize product array dynamically. [User choice] 

Take a for loop to initialize the product array with user input.

We need to search the Prodcut from product array based on the product id, With the help of Scanner class ask user to input id value, using for each loop, search whether the given id product is available or not. [see test cases for more details]

If product is available based on the given id, print the product object otherwise print 
product object is not available with the given id. [Product id is working as a primary key]
 */

package com.array.collection_basic;

import java.util.Scanner;

public class ProductArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = Integer.parseInt(IO.readln("Enter number of Products: "));
		int idVal = 0;
		int count = 0;
		Product products[] = new Product[size];

		for (int i = 0; i < size; i++) {
			IO.println("");
			IO.println("Enter details of Product " + (i + 1));
			int id = Integer.parseInt(IO.readln("Enter id : "));
			String name = IO.readln("Enter name : ");
			double price = Double.parseDouble(IO.readln("Enter Price: "));

			products[i] = new Product(id, name, price);

		}
		idVal = Integer.parseInt(IO.readln("Enter id value:"));

		for (Product p : products) {
			if (p.getId() == idVal) {
				IO.println("Product Found: " + p);
				count++;
			}

		}

		if (count == 0) {

			IO.println("Product with id " + idVal + " not found");

		}
	}

}
