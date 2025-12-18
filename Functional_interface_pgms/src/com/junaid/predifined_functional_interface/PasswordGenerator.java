
/*
 * Assignment 03 :
---------------
Create a Java program using the Supplier interface to generate random passwords. The password should be 8 characters long.

Contain a mix of uppercase letters, lowercase letters, digits, and special characters (e.g., @, #, $, !).

Coding  Requirements:
Create a PasswordGenerator class.

Inside the main method :

Define character sets [For password generation as shown below]

 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 String lower = "abcdefghijklmnopqrstuvwxyz";
 String digits = "0123456789";
 String special = "@#$%!&*";

Combine all the character set into a single String

Define a Supplier<String> named passwordSupplier which will generate and return a Random Password (Using all character set) by using java.util.Random class.

Use this supplier to generate and print a random secure password.

Output :

Generated Password: Ab3#eT9!
 * 
 * 
 * */

package com.junaid.predifined_functional_interface;
import java.util.Random;
import java.util.function.Supplier;
public class PasswordGenerator {

	public static void main(String[] args) {
	 Random rand = new Random();
	 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 String lower = "abcdefghijklmnopqrstuvwxyz";
	 String digits = "0123456789";
	 String special = "@#$%!&*";
	 
	 String singleStringContainer=upper+lower+digits+special;
	 Supplier<String> passwordSuppllier = ()->{
		 String password="";
		
		for(int i=0;i<8;i++) {
			 int index = rand.nextInt(singleStringContainer.length());
			  password=password+singleStringContainer.charAt(index);
			 
			 
				
			 
		}
		return password;
	 };
	 IO.println("Generated Password: "+passwordSuppllier.get());
	 
	   
	}

}
