package com.blc.elc;

public class Bank {
  private String customerName;
  private int accountNumber;
  private double currentBalance;
 public static String bankName="State Bank Of India";
 public static String bankAddress="Dist Jalgaon Tal:Raver Post:Nimbhora Near Railway Station";
 public static String bankIFSCode="SBIN000789";
 
 public void setCustomerDeatils(String name,int accountNo,double balance) {
	 customerName=name;
	 accountNumber=accountNo;
	 currentBalance=balance; 
	 System.out.println("Customer Account created successfully!");
 }
 
 public void withdraw(double amount) {
	 if(amount>currentBalance) {
		 System.err.println("Insufficient balance");
		 System.exit(0);
	 }
	 currentBalance-=amount;
	 System.out.println("Amount After Withdrawal : "+currentBalance);
	 
 }
 public void deposit(double amount) {
	 if(amount<=0) {
		 System.err.println("Amount should be Greater than zero");
		 System.exit(0);
	 }
	 currentBalance+=amount;
	 System.out.println("Amount After Deposit : "+currentBalance);
 }
 public double getCurrentBalance() {
	 return currentBalance;
 }

 
 public String displayDeatails() {
	return "Bank [customerName=" + customerName + ", accountNumber=" + accountNumber + ", currentBalance="
			+ currentBalance + "]";
 }
  
 
  
  
}

