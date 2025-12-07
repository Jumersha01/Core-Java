package com.junaid.abstraction_classes;




abstract  class Vehicle {
    
	public abstract void run();
	public abstract void fuel();
	public void details() {
		System.out.println("Partiel abstraction");
	}
	
}
//car  class
class Car  extends Vehicle{
	public void run() {
		System.out.println("Car is runnig");
		
		
	}
	public void fuel() {
		System.out.println("Car consuming the deasel fuel");
	}
}
class Bike extends Vehicle{
	public void run() {
		System.out.println("Bike is runnig");
	}
	
	public void fuel() {
		System.out.println("Bike is consuming petrol fuel");
	}
}


