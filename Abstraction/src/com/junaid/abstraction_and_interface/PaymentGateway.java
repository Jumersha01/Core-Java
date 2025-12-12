package com.junaid.abstraction_and_interface;

public class PaymentGateway  {

public Payments initiatePayment(String paymentType)
{
	Payments pay=null;
	if(paymentType.equalsIgnoreCase("creditcard")) {
		pay= new CreditCardPayment();
		
	}
	else if(paymentType.equalsIgnoreCase("upi")) {
		pay= new UPIPayment();
	}
	else {
		pay = null;
	}
	return pay;

	
}
}
