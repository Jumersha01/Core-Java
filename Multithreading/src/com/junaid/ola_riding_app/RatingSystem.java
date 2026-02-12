package com.junaid.ola_riding_app;

public class RatingSystem extends Thread{

	@Override
	public void run() {
		IO.println("Requesting user rating...");
		try {
			Thread.sleep(1000);	
			}
			catch(InterruptedException e) {
				IO.println("Thread got interrupted");
			}
		IO.println("User rated the ride: 5 star");
	}

}
