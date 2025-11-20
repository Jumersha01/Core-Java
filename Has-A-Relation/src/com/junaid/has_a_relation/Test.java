package com.junaid.has_a_relation;

import java.util.*;
public class Test{
public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Street name: ");
 String street = sc.nextLine();
 
 System.out.print("Enter City name: ");
 String city = sc.nextLine();
 
 System.out.print("Enter Your Name: ");
 String name = sc.nextLine();
 
 //System.out.print("Enter Address: ");
 Address ad = new Address(street,city);
 Person p = new Person(name,ad);
 System.out.println(p.getPerson());
}
}
class Address{
 private String street;
 private String city;
 Address(String street,String city){
 this.street = street;
 this.city= city;
 }
 public void setStreet(String street){
 this.street=street;
 }
 public String getStreet(){
 return this.street; 
 }
 public void setCity(String city){
 this.city=city;
 }
 public String getCity(){
 return this.city;
 }
 public String toString(){
 return "Address: Street - "+this.street+", City - "+this.city;

 }
}
class Person{
 private String name;
 private Address address;
 Person(String name,Address address){
 this.name=name;
 this.address= address;
 }
 public String getPerson(){
 return "Person Name: "+this.name+"\n"+""+address.toString();
 }
}
