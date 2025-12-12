package com.junaid.abstraction_and_interface;

public class UPIPayment implements Payments {

public void processPayments() {
		
IO.println("Initiating UPI payment");
IO.println("Processing UPI payment...");
	}

	@Override
	public void applyDiscunt() {
		IO.println("Applying 5% discount for UPI payment");
		
	}
}
