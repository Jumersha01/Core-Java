package com.junaid.arraylist;

public record Customer(int custId,String customerName,String pickupLoacation,String dropLocation,int distance,String phone) {
  public Customer{
	   if(custId<=0) {
		   IO.println("Id Cant be zero or negative");
		   System.exit(0);
	   }
	   else if(distance<=0) {
		   IO.println("Distance cant be zero or negative.");
		   System.exit(0);
	   }
	   else if(customerName.isEmpty()||customerName.isBlank()||pickupLoacation.isBlank()||pickupLoacation.isEmpty()){
		  IO.println("Customer name can not be empty or null."); 
		  System.exit(0);
	   }
	   else if(phone.isBlank()||phone.isEmpty()){
		   IO.println("Phone no cant be empty or null");
		   System.exit(0);
	   }
	   
	   
   }
}
