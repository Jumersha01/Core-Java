package com.junaid.abstraction_and_interface;

public class CreditCardPayment implements Payments{
public void processPayments() {
	IO.println("Initiating Credit Card payment");
	IO.println("Processing Credit Card payment...");
	
}

public  void applyDiscunt() {
	IO.println("Applying 10% discount for Credit Card payment");
}
}
