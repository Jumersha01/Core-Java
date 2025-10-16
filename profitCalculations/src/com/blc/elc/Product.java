package com.blc.elc;

public class Product {
private int id;
private String name;
private double price;

public void setProductDetails(int id,String name,double price) {
	this.id = id;
	this.name=name;
	this.price=price;
}

public void calculateDiscount() {
	double discountAmount=0;
	if(this.price<1000) {
		discountAmount=(price*0.5);
	  
	}
	else if(this.price>=1000&&this.price<=5000) {
		discountAmount=(price*0.10);
	}
	else {
		discountAmount=(price*0.15);
	}
	price -=discountAmount;
	System.out.println("Discount Amount :"+discountAmount);
	System.out.println("Price After Discount :"+price);
}


public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}



}
