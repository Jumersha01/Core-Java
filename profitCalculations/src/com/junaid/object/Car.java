package com.junaid.object;

public class Car {
	String name;
	int model;
	String color;
	
	public void getInformation() {
		System.out.println("The name of the car is :"+name);
		
	}
	public void testDrive() {
		System.out.println("The driver is driving the car");
	}
	public static void main(String []args) {
		Car c1 = new Car();
		c1.name ="MARUTI";
		c1.model=2015;
		c1.color="Red";

	c1.getInformation();
	c1.testDrive();
	//thisis
		
		
	}

}
