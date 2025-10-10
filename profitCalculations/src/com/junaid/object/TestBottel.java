package com.junaid.object;

public class TestBottel {
	String name;
	String color;
	int size;
	  public void getBottleInfo() {		  
		  System.out.println("The name of the water bottle is "+name);
		  System.out.println("The color of the water bottle is "+color);
		  System.out.println("The size of the water bottle is "+size);
	  }

	public static void main(String []args) {
		TestBottel b1 = new TestBottel();
		b1.name="POLO";
		b1.color="Purple";
		b1.size=1;
		
		b1.getBottleInfo();
		
	}
}
