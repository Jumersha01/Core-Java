package com.blc.elc;

public class Book {
private String title;
private String author;
private double price;

 public Book(String title,String author,double price){
	 this.title = title;
	 this.author=author;
	  this.price = price;
	  if(this.price<=0) {
		  System.err.println("Book Price Cannot Be Negative");
	  }
	  
	  
 }


 public String toString() {
	return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
 }
 
  public void applyDiscount(double discountPercentage) {
	  if(discountPercentage<=0) {
		 System.out.println(" Error: Invalid discount percentage.");
		 System.exit(0);
	  }
	  price-=discountPercentage;
	  
	  
  }
 
}
