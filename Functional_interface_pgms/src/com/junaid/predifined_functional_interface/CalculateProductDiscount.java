/*/
 * Assignment 01 :
----------------------
Develop a scenario based program by using Functional interface to provide some discount on the Product on this Winter season.

Coding Requirement :
--------------------
Create a record called Product.

Components :
------------
 id : Integer
 name : String
 price : Double

Take an ELC class CalculateProductDiscount with main method.
In this create a Function<T,R> functional interface which will take Product as a input parameter and will return discounted price on the following criteria :

a) 10% discount on Product price, If product price is greater then OR equal 
   to 5000.
b) 5% discount on Product price, If product price is less then 5000.

Note : The Function<T,R> should return the final price that means discounted price. [price - discount].

Take the Product data as a input from the user using IO class
and print the following deatils given in the test cases.

Test Case for Output :
----------------------
Test case 01 :
--------------
Enter Product Id :101
Enter Product Name :Laptop
Enter Product Price :50000
Final price of the product is :45000.0

 */

package com.junaid.predifined_functional_interface;

import java.util.function.Function;

public class CalculateProductDiscount {

	public static void main(String[] args) {
		Function<Product, Double> calculateDiscount = product -> {
			double discountedPrice = 0;
			double actualPrice = product.price();
			if (actualPrice >= 5000) {
				discountedPrice = (actualPrice - (actualPrice * 0.10));

			} else {
				discountedPrice = (actualPrice - (actualPrice * 0.05));
			}
			return discountedPrice;
		};

		int id = Integer.parseInt(IO.readln("Enter Product Id: "));
		String name = IO.readln("Enter Product name:");
		double price = Double.parseDouble(IO.readln("Enter Product Price: "));

		Product p1 = new Product(id, name, price);

		IO.readln("Final Price of the product is: " + calculateDiscount.apply(p1));

	}

}
