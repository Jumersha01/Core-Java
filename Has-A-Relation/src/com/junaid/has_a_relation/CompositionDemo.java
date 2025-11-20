package com.junaid.has_a_relation;


import java.util.*;
public class CompositionDemo{
 public static void main(String [] args){
 Scanner sc = new Scanner (System.in);
 
 System.out.print("Enter Engine Model :");
 String engModel = sc.nextLine();
 
 System.out.print("Enter Engine Capacity :");
 int engCap =Integer.parseInt(sc.nextLine());
 
 System.out.print("Enter Car Make :");
 String carMke = sc.nextLine();
 
 System.out.print("Enter Car Model :");
 String carmod = sc.nextLine();
 
 System.out.print("Enter Car Year :");
 int year = Integer.parseInt(sc.nextLine());
 
 Car c = new Car(engModel,engCap,carMke,carmod,year);
 
 System.out.println(c.toString());
 }
}
//Engine class
class Engine{
 private String model;
 private int ingineCapacity;
 Engine(String model,int ingineCapacity){
 this.model= model;
 this.ingineCapacity = ingineCapacity;
 if(ingineCapacity<=0){
 System.out.println("Error Invalid Input");
 System.exit(0);
 }

 }
 public String getModel(){
 return this.model;
 }
 public int getIEngineCapacity(){
 return this.ingineCapacity;
 }
 public String toString(){
 return "Engine Details -> Engine Model: "+this.getModel()+", Engine Capacity:"+this.getIEngineCapacity()+"cc";
 }
}
class Car {
 private String carMake; 
 private String carModel;
 private int year;
 private Engine engine;
 Car(String model ,int capacity,String carMake,String carModel,int year){
 this.carMake = carMake;
 this.carModel = carModel;
 this.year = year;
 if(year<=0){
 System.out.println("Error Invalid Input");
 System.exit(0);
 }
 this.engine = new Engine(model,capacity);
 }
 public String toString(){
 return "Car Make: "+this.carMake+", Car Model: "+this.carModel+", Year:"+this.year+"\n"+engine.toString();
 }
}