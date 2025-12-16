/*Develop a scenario based program by using Functional interface to check whether a Car 
is eligible for sale or not.

Create one record called Car.
Components :
 brand : String
 price : Double
 mileage : Integer
 
 Take an ELC class CarSelling with main method. Using IO class data input, Create the 
 object for Car class.

 In the ELC class write a Predicate<T> to verify whether Car is eligible for sale or 
 not based on the following criteria.
  a) Car price should be less or equal to 5 lac.
  b) Car mileage must be greater or equal than 20.
  */

	


package com.junaid.predifined_functional_interface;

import java.util.function.Predicate;

public class CarSelling {

	public static void main(String[] args) {
		String brand = IO.readln("Enter the brand name of the car: ");
		double price =Double.parseDouble(IO.readln("Enter the Price of the car: "));
		int num  = Integer.parseInt(IO.readln("Enter the milage of the car: "));
		
		Car car = new Car(brand,price,num);
		
		Predicate<Car> isValid=cars->cars.price()<=500000&&cars.milage()>=20;
		
		if(isValid.test(car)) {
			IO.println("Car is Eligible for sale");
		}
		else {
			IO.println("Car is not eligible for sale");
		}
		

	}

}
