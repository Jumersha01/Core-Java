package com.junaid.method_overriding;

public class CreditPayment extends Payment {
 @Override
 public void processPayment() {
	 System.out.println("Processing Credit Card Payment");
 }
}
