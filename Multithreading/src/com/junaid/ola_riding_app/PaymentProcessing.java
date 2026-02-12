package com.junaid.ola_riding_app;

public class PaymentProcessing extends Thread {
	@Override
	public void run() {
		IO.println("Processing payment...");
		try {
			Thread.sleep(2000);	
			}
			catch(InterruptedException e) {
				IO.println("Thread got interrupted");
			}
		IO.println("Payment successful!");
	}

}
