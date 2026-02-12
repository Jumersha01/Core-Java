package com.junaid.ola_riding_app;

public class DriverAssignment extends Thread{
@Override
public void run() {
	try {
		Thread.sleep(3000);
		
	}
	catch(InterruptedException e) {
		
	}
	IO.println("Driver found and assigned!");
	
}
}
