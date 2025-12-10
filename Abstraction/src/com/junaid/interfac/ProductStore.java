
/*
 * 
Assignment 02 :
---------------
Develop a scenario based program by using abstract class and abstract method for displaying different kinds of Products like Digital Product and 
Physical Product as well as discount and tax applicable on thses products

We need to develop one program on Hierarchical Inheritance, where Product is the super class and It has two sub classes DigitalProduct and PhysicalProduct.

Validate all the user inputs in constructor and where it is required.

Coding Requirements :
---------------------
Create one BLC class called Product.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------
name : String
price : double 
category : String

Take a parameterized constructor to initialize all the fields.

Methods :

a) Method Name     : applyDiscount()
Argument           : One argument of type double [double percentage]
Return Type        : void
Access modifier    : public and abstract


b) Method Name     : calculateTax()
Argument           : No Argument
Return Type        : double
Access modifier    : public and abstract


c) Setter and getter for price variable.

d) Generate toString() method to print Object properties. 


Create another class DigitalProduct which extends from Product class.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------------
licenseKey : String

Take a parameterized constructor to initialize all the fields.

Methods :
a) Override applyDiscount(double percentage) method
   In this method find out the discount based on the given percentage on the product price.
   Update the new price based on the given discount.
   Print both Discount and Updated Price.


b)Override calculateTax() method 
  In this method you should return 5% tax on the discounted price.

c) Generate toString() to print all the fields


Create another class PhysicalProduct which extends from Product class.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------------
shippingWeight : double

Take a parameterized constructor to initialize all the fields.

Methods :
a) Override applyDiscount(double percentage) method
   In this method find out the discount based on the given percentage on the product price.
   Update the new price based on the given discount.
   Print both Discount and Updated Price.


b)Override calculateTax() method 
  In this method you should return 8% tax on the discounted price.

c)
Method Name        : calculateShippingCost()
Argument           : No argument
Return Type        : double
Access modifier    : public 
 
In this method you need to calculate and return shipping cost of the Physical Product. The defined shipping cost is 5 RS per KG.

d) Generate toString() to print all the fields

Create an ELC class called ProductStore.

Inside main method display the following details as a Menu.
Select Product Type:
1. Digital Product
2. Physical Product

Write Switch case with Scanner class to select Digital OR Physical Product


Test Cases for Output :
------------------------
Test Case 1 :
-------------
Select Product Type:
1. Digital Product
2. Physical Product

Test Case 2 :
-------------
Select Product Type:
1. Digital Product
2. Physical Product
1
Enter Digital Product Name :Java E Book
Enter Product Price :1000
Enter Product Category :Electronics
Enter Product License Key :E_BOOK_001
Enter the discount % on final bill
10
Digital Product :
Product Name: Java E Book
Category: ElectJronics
Price RS:1000.0
License Key: E_BOOK_001
Discount applied :100.0
New Price :900.0
Tax RS : 45.0

Test Case 3 :
-------------
Select Product Type:
1. Digital Product
2. Physical Product
2
Enter Physical Product Name :Mobile
Enter Product Price :50000
Enter Product Category :Electronics
Enter Product weight :1
Enter the discount % on final bill
12
Physical Product:
Product Name: Mobile
Category: Electronics
Price RS:50000.0
Shipping Weight: 1.0 kg
Discount applied :7500.0
New Price :42500.0
Tax RS :3400.0
Shipping Cost RS :5.0

Test Cases for Input Validation :
---------------------------------
Test Case 1:
-------------
Select Product Type:
1. Digital Product
2. Physical Product
1
Enter Digital Product Name :null
Enter Product Price :12890
Enter Product Category :Electronics
Enter Product License Key :E_BUK_0001
Product name cannot be empty or null.

Test Case 2:
-------------
Select Product Type:
1. Digital Product
2. Physical Product
2
Enter Physical Product Name :Laptop
Enter Product Price :-10000
Enter Product Category :Electronics
Enter Product weight :2.9
Price cannot be negative.


Test Case 3:
-------------
Select Product Type:
1. Digital Product
2. Physical Product
1
Enter Digital Product Name :E_Java_Book
Enter Product Price :1567.90
Enter Product Category :null
Enter Product License Key :E_BUK_0001
Category cannot be empty or null.
 * 
 * */


package com.junaid.interfac;
import java.util.Scanner;
abstract class Product{
	private String name;
	private double pricee;
	private String category;
	public Product(String name, double pricee, String category) {
		super();
		
		if(name==null||name.isBlank()||name.isEmpty()) {
			System.out.println("Product name cannot be null or Empty");
			System.exit(0);
		}
		else {
			
			this.name = name;
		}
		if(pricee<=0) {
			System.out.println("Product Price cannot be Zero Or Negative: ");
			System.exit(0);
		}
		else {
			
			this.pricee = pricee;
		}
		
		if(pricee>=0) {
			System.out.println("Product Category cannot be null or Empty: ");
			System.exit(0);
		}
		else {
			
			
			this.category = category;
		}
	}
	
	public abstract void applyDiscount (double percentage);
	public abstract  double calculateTax();

	public double getPricee() {
		return pricee;
	}
	

	public void setPricee(double pricee) {
		this.pricee = pricee;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String toString();
	
	
}
class DigitalProduct  extends Product{
	String licenseKey;

	public DigitalProduct(String name, double pricee, String category, String licenseKey) {
		super(name, pricee, category);
		this.licenseKey = licenseKey;
	}
	public void applyDiscount(double percentage) {
		double price = this.getPricee();
		double discount = (price*percentage)/100;
		System.out.println(""+discount);
		this.setPricee((price-discount));
		
		
	}
	public double calculateTax() {
		 double amount = this.getPricee();
		 double taxAmount= (amount*0.05);
		 return taxAmount;
	}
	@Override
	public String toString() {
		return "DigitalProduct [licenseKey=" + licenseKey + "]";
	}
	
	
	
}
class PhysicalProduct extends Product{
	private double shippingWeight;

	public PhysicalProduct(String name, double pricee, String category, double shippingWeight) {
		super(name, pricee, category);
		this.shippingWeight = shippingWeight;
	}
	
	public void applyDiscount(double percentage) {
		double price = this.getPricee();
		double discount = (price*percentage)/100;
		System.out.println(""+discount);
		this.setPricee((price-discount));
		
	}
	
	public double calculateTax() {
		
		 double amount = this.getPricee();
		 double taxAmount= (amount*0.08);
		 return   taxAmount;
	}
	public double calculateShippingCost() {
		return this.shippingWeight*5;
	}

	@Override
	public String toString() {
		return "PhysicalProduct [shippingWeight=" + shippingWeight + "]";
	}
	
	
}

public class ProductStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select Product Type: ");
		System.out.println("1.Digital Product");
		System.out.println("2.Physical Prodct");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice) {
		case 1->{
			System.out.print("Enter Digital Product Name :");
			String pName = sc.nextLine();
			
			System.out.print("Enter Product Price : ");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter Product Category : ");
			String category = sc.nextLine();
			
			System.out.print("Enter Product License Key : ");
			String licenseKey = sc.nextLine();
			
			Product digital = new DigitalProduct(pName,price,category,licenseKey);
			System.out.print("Enter the discount % on final bill : ");
			double discountPer = Double.parseDouble(sc.nextLine());
			
			
			System.out.println("Digital Product : ");
		    System.out.println("Product Name: "+digital.getName());
		    System.out.println("Category: "+category);
		    System.out.println("Price RS: "+digital.getPricee());
		    System.out.println("License Key: "+licenseKey);
		    System.out.print("Discount applied : ");digital.applyDiscount(discountPer);
		    System.out.println("\n");
		    System.out.println("New Price: "+digital.getPricee());
		   
		    System.out.println("Tax : "+digital.calculateTax());
            			
			
		}
		case 2 ->{
			System.out.print("Enter Physical Product Name :");
			String pName = sc.nextLine();
			 
			System.out.print("Enter Product Price : ");
			double price = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter Product Category : ");
			String category = sc.nextLine();
			
			System.out.print("Enter Product Weight: ");
			double weight = Double.parseDouble(sc.nextLine());
			
			Product physical = new PhysicalProduct(pName,price,category, weight);
			System.out.print("Enter the discount % on final bill : ");
			double discountPer = Double.parseDouble(sc.nextLine());
			
			
			System.out.println("Physical Product : ");
		    System.out.println("Product Name: "+physical.getName());
		    System.out.println("Category: "+category);
		    System.out.println("Price RS: "+physical.getPricee());
		    System.out.println("Product Weight: "+weight);
		   
		    System.out.print("Discount applied : ");physical.applyDiscount(discountPer);
		;
		    System.out.println("New Price: "+physical.getPricee());
		   
		    System.out.println("Tax : "+physical.calculateTax());
		    PhysicalProduct phy = (PhysicalProduct) physical;
		    System.out.println("Shipping Cost RS: "+phy.calculateShippingCost());
			
		}
		}
		
	

	}

}
