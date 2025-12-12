package com.junaid.abstraction_and_interface;

public class PaymentGatewayUsingInterface {
void main() {
	String paymentType = IO.readln("Enter Payment Type [CreditCard/ UPI] :");
	
	PaymentGateway gateway = new PaymentGateway();
	Payments payment=gateway.initiatePayment(paymentType);
	if(payment==null) {
		IO.println("Invalid payment type selected!");
		System.exit(0);
	}
	payment.processPayments();
	payment.applyDiscunt();
	
}
}
