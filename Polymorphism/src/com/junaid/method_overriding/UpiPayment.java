package com.junaid.method_overriding;

public class UpiPayment extends Payment {
@Override
 public void processPayment() {
	System.out.println("Processing Payment");
}
}
