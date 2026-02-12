package com.junaid.ola_riding_app;

public class FareCalculation  extends Thread{
	@Override
	public void run() {
		IO.println("Calculating estimated fare...");
		try {
		Thread.sleep(1500);	
		}
		catch(InterruptedException e) {
			IO.println("Thread got interrupted");
		}
		IO.println("Estimated fare: 135.75 RS.");
	}

}
