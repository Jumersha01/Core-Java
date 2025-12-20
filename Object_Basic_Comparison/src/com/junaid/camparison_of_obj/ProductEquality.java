package com.junaid.camparison_of_obj;

/*
 * Program 01 :
------------
Create an application to compare two objects based on the content by overriding the equals(Object obj) method of Object class.

Create a BLC class called Product

Instance variables :
private int productId
private String productName

Create a parameterized constructor to initialize all properties.

Override equals(Object obj) method from Object class to compare the content of Product object, Make sure that if end user try to compare the content of two different objects (Product and Employee) then program should provide proper message.

Create an ELC class ProductEquality to test your application by creating two objects of Product class to compare the content by calling Product class overridden equals(Object obj) method.

Follow the equals() and hashCode() contract.
*/
class Product{
	int productId;
	String productName;
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	public boolean equals(Object obj) {
		int id = this.productId;
		String name= this.productName;
		
		Product p  = (Product) obj;
	    int id2 = p.productId;
	    String name2 = p.productName;
	    if(id==id2&&name.equals(name2)) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	public int hashCode() {
		return this.productId;
	}
	
}
public class ProductEquality {
void main() {
	int id =Integer.parseInt(IO.readln("Enter the Id: "));
	String name= IO.readln("Enter product name: ");
	
	int id1 =Integer.parseInt(IO.readln("Enter the Id1: "));
	String name1= IO.readln("Enter product name1: ");
	
	Product p1 = new Product(id,name);
	Product p2 = new Product(id1,name1);
	if(p1.equals(p2)) {
		IO.println("Both Product Object are having same content");
		IO.println("Hashcode is: "+p1.hashCode() );
	}
	else {
		IO.println("Both Product Object are having different content");
	}
}
}
