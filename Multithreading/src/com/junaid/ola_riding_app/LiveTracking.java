package com.junaid.ola_riding_app;

public class LiveTracking  extends Thread{
	int inc = 20;
@Override
public void run() {
	
	for(int i=1;i<=5;i++) {
		IO.println("Updating ride location..."+(inc*i) +"% completed");
	}
	IO.println("Ride completed!");
}
}
