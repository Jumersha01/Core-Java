package com.junaid.object;

public class Fan {
	String name;
	String coil;
	int wing;
	public void switchOn() {
		System.out.println("The Fan Is On");
	}
	public void switchOFF() {
		System.out.println("The Fan is Off Now");
	}
	public void getInfo() {
		System.out.println("The name of the fan is :"+name);
		System.out.println("The no  of  wing of the fan is :"+wing);
		System.out.println("The type of fan coil is :"+coil);
	}
	
	
	public static void main(String[] args) {
		Fan f1 = new Fan();
		f1.name="Usha";
		f1.coil="Copper";
		f1.wing=3;
		
		f1.switchOn();
		f1.switchOFF();
		f1.getInfo();
		
		
	
	}

}
