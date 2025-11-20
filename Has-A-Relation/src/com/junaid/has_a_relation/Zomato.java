package com.junaid.has_a_relation;

import java.util.*;
public class Zomato{
 public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter  Id: ");
 String id = sc.nextLine();

 System.out.println("Enter item Name: ");
 String itemName = sc.nextLine();
 
 System.out.println("Enter Price: ");
 double price = Double.parseDouble(sc.nextLine());
 
 Order d = new Order(id,itemName,price);
 
 System.out.println("Enter Customer Name: ");
 String name = sc.nextLine();
 
 System.out.println("Enter Customer Email: ");
 String email = sc.nextLine();
 
 System.out.println("Enter Customer Address: ");
 String address = sc.nextLine();
 
 System.out.println("Enter Customer Mobile No: ");
 long mobNo = Long.parseLong(sc.nextLine());
 Customer c = new Customer(name,email,address,mobNo,d);
System.out.println(c.toString());
 }
 
}
class Order{
 private String orderId;
 private String itemName;
 private double productPrice;
 Order(String orderId,String itemName,double productPrice){
 this.orderId = orderId;
 this.itemName = itemName;
 this.productPrice = productPrice;
 }
 public String getOrderId(){
 return this.orderId;
 }
 
 public String getItemName(){
 return this.itemName;
 }
 public double getPrice(){
 return this.productPrice;
 }
 public String toString(){
 return "Order Details:"+"\n"+"Order ID: "+this.orderId+"\n"+"Product Name:"+this.itemName+"\n"+"Price: "+this.productPrice;
 }
}

//This is customer class

class Customer{
	 private String name;
	 private String email;
	 private String address;
	 private long mobileNo;
	 private Order order;
	 Customer(String name,String email,String address,long mobileNo,Order order){
	 this.name = name;
	 this.email=email;
	 this.address=address;
	 this.mobileNo = mobileNo;
	 this.order = order;
	 }
	 public String toString(){
	 return "Customer Details:"+"\n"+"Name: "+this.name+"\n"+"Email:"+this.email+"\nAddress: "+this.address+"\nMobile:"+this.mobileNo+"\n\n"+order.toString();
	 }
	 
	}