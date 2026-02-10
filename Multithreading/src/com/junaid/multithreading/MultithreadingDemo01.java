package com.junaid.multithreading;

class VerifyOtp extends Thread{
	@Override
	public void run() {
		IO.println("Verifying OTP");
		Thread t = currentThread();
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			IO.println("Thread is interupted");
		}
		IO.println("Otp verified");
		
	}
}

class BalanceThread extends Thread{
	 
	@Override
	public void run() {
		 IO.println("Balance Checking");
		 try {
			 Thread.sleep(1500);
		 }
		 catch(InterruptedException e) {
			 IO.println("Thread is interupted");
		 }
		 IO.println("Balanced Checked ");
	}
}

public class MultithreadingDemo01 {
   public static void main(String args[]) throws InterruptedException {
    	IO.println("Main method started ");
    	    VerifyOtp t1 = new VerifyOtp();
    	    BalanceThread t2 = new BalanceThread();
    	     t1.start();
    	     t2.start();
    	   
    	     t2.join();
    	     t1.join();
    	      
    	 	IO.println("Main method ended ");
    }
}
