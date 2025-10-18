package com.blc.elc;

public class Car {
private String model;
private int year;
private double price;
//  public Car(String model,int year,double price) {
//	 
//	  
//  }

  public Car(String model2, int year2, double price2) {
	  if(year2<=2010) {
		  System.out.println("Year must be greater than " +year2);
		  System.exit(0);
	  }
	  if(price2<=0) {
		  System.out.println("Price must be positive Integer");
		  System.exit(0);
	  }
	  this.model=model2;
	  this.year=year2;
	  this.price = price2;
}

  public String toString() {
	return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";
  }
  
}
