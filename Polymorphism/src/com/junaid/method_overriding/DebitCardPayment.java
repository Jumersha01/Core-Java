package com.junaid.method_overriding;

public class DebitCardPayment extends Payment {
@Override
public void processPayment() {
	System.out.println("Processing Debit Card Payment");
}
}
