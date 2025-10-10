package com.junaid.object;

public class TestWatch {
	String name;
	double price;
	String color;
	public void getWatchInfo() {
		System.out.println("The name of the watch is : "+name);
		System.out.println("The price of the watch is : "+price);
		System.out.println("The color of the watch is : "+color);
	}
	
 public static void main(String []args) {
	 TestWatch w1 =new  TestWatch();
	 w1.name="Sonata";
	 w1.price=2500;
	 w1.color="Black";
	 w1.getWatchInfo();
 }
}
