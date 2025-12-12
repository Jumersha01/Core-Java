package com.junaid.abstraction_classes;




abstract  class Vehicles {
    
	public abstract void run();
	public abstract void fuel();
	public void details() {
		System.out.println("Partiel abstraction");
	}
	
}
//car  class
class Car  extends Vehicles{
	public void run() {
		System.out.println("Car is runnig");
		
		
	}
	public void fuel() {
		System.out.println("Car consuming the deasel fuel");
	}
}
class Bike extends Vehicles{
	public void run() {
		System.out.println("Bike is runnig");
	}
	
	public void fuel() {
		System.out.println("Bike is consuming petrol fuel");
	}
}
public class Vehicle{
public static void main (String [] args) {
	Vehicles bike = new Bike();
	bike.run();
	bike.fuel();
}
}



