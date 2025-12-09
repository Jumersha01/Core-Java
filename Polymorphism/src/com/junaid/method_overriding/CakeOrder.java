/*Create a program on abstract class to display Cake details with message and without
event message.

Coding Requirements :
--------------------
Create a BLC class called Cake with following attributes :

Attributes/Properties/Fields: [Access modifier is private for all the fields]

Attribute Name : shape String
Attribute Name :flavor String
Attribute Name :quantity int
public static double price = 400;

Create a Parameterized Constructor to initialize only shape, flavor and quantity.
[Don't initialize price through Constructor, Manual Initialization]

Methods :
  1) Define setters and getters for all non static fields
  2) Name of the method : toString()
     Return Type : String
     Modifier : public.
     Task : It must return the data as per below format/example.
     "A Round Chocolate Cake Of 4 KG is Ready @ Rs.1600.0"
     
Create an inherited class "OrderedCake". Inherit this from "Cake"
Define the following Attributes
Attributes: [private for all the fields]
Attribute name : message String

Constructors:(3 only)
   1) No argument Constructor : Ensure shape is Round, flavour is Vanilla,
      qty is 1 kg and price is 400. [see the output test cases]
   2) Parameterized public Constructor : For shape,flavor,quantity
   3) Parameterized public Constructor : For shape,flavor,quantity and message.
   Price is to be dynamically changed @400 per Kg.
Methods :
Name of the method : toString()
     Return Type : String
     Modifier : public.
     Task :Print the following if message is not null 
    "A Square Pineapple Cake of 3KG is Ready with Happy Birthday message @ Rs.1200.0".
      Otherwise display the message from superclass.
      
      
Create an ELC class CakeOrder to display cake details with price and message.

Test Cases for Output :
------------------------
A Round Vanila Cake Of 1 KG is Ready @ Rs.400.0
A Round Chocolate Cake Of 4 KG is Ready @ Rs.1600.0
A Square Pineapple Cake Of 3KG is Ready with Happy Birthday message @ Rs.1200.0

*/


package com.junaid.method_overriding;
import java.util.Scanner;



public class CakeOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	      Cake cake = new OrderedCake();
	      System.out.println( cake.toString());
	    
	      System.out.println(".....................................");
		 
		 cake = new OrderedCake("Round","Chocolate",2);
		System.out.println( cake.toString());
		 
		
		System.out.println(".....................................");
		  
		 cake = new OrderedCake("Square","Pinapple",3,"Its My Birthday Today");
		 System.out.println( cake.toString());
		 
	}

}
 class Cake{
	private String shape;
	private String flavaour;
	private int quantity;
	private static  double price =400;
	
	public Cake(String shape, String flavaour, int quantity) {
		super();
		this.shape = shape;
		this.flavaour = flavaour;
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public String getFlavaour() {
		return flavaour;
	}

	public int getQuantity() {
		return quantity;
	}

	public static double getPrice() {
		return price;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public void setFlavaour(String flavaour) {
		this.flavaour = flavaour;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static void setPrice(double price) {
		Cake.price = price;
	}
	
	public String toString(){
		return "A "+this.shape+""+this.flavaour+" of "+this.quantity+"kg"+"is Ready "+" @RS. "+this.price*this.quantity;
	}
	
	
}
 class OrderedCake extends Cake{
	     private String message;
	     OrderedCake(){
	    super("Round","Vanilla",1);
	  
	     }
		 public OrderedCake(String shape, String flavaour, int quantity) {
			super(shape, flavaour, quantity);
			
		 }
		 public OrderedCake(String shape, String flavaour, int quantity, String message) {
			super(shape, flavaour, quantity);
			this.message = message;
		 }
		 public  String toString() {
			 if(message!=null) {
				 
			 return "A "+this.getShape()+" "+this.getFlavaour()+" cake of "+this.getQuantity()+" kg "+" is Ready With Happy Birthday "+message +" @ RS. "+this.getPrice()*this.getQuantity();
		 }
			 else {
				 return "A "+this.getShape()+" "+this.getFlavaour()+" cake of "+this.getQuantity()+" kg "+" is Ready With Happy Birthday  @ RS. "+this.getPrice()*this.getQuantity();
			 }
		 }
		 
		 
		 
		 
	     
 }

