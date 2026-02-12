package com.junaid.ola_riding_app;

public class RideRequest  extends Thread{
	@Override
	public void run () {
		IO.println("User Requested a ride...");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			IO.println("Thread Interrupeted");
		}
		IO.println(" Searching for nearby drivers...");
	}

}
