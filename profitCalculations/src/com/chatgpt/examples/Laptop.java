package com.chatgpt.examples;

import java.util.Scanner;

public class Laptop {
         final String serialNumber;
         final String ownerName;
         final static  String companyName="Dell";
         
          Laptop(String serialNumber,String ownerName){
        	  super();
        	  this.serialNumber=serialNumber;
        	  this.ownerName=ownerName;
        	  
          }
          public String getDetails() {
        	  return "Laptop Detals:"+"\n"+"Company: "+this.companyName+"\n"+"Owner: "+this.ownerName+"\n"+"Serial :"+this.serialNumber;
          }
        
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the serial NO:");
	String serialNO=sc.nextLine();
		
		System.out.print("Enter the owner Name:");
		String ownerName=sc.nextLine();
		
		Laptop l1 = new Laptop(serialNO,ownerName);
	System.out.println(l1.getDetails());
	

	}

}
