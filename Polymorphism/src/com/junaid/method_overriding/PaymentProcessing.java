package com.junaid.method_overriding;

public class PaymentProcessing {

	public static void main(String[] args) {
		Payment debit = new DebitCardPayment();
		Payment credit = new CreditPayment();
		Payment upi = new UpiPayment();
		
		paymentGateway(debit,credit,upi);

	}
	public static  void paymentGateway(Payment...payment) {
		for(Payment p : payment) {
			p.processPayment();
		}
	}

}
