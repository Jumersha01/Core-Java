package com.junaid.multithreading_lab;
//Re-Write the above program where even and odd numbers printing should be done by two different child threads (class name is EvenThread and OddThread, both are extending from Thread class). Here first of all even number should be printed then only odd numbers.
class Odd extends Thread{
	@Override
   public void run() {
		  IO.println("Odd Thread Started ");
		  for(int i =1;i<=100;i++) {
			  
			  Thread t = Thread.currentThread();
			 
			  if(i%2!=0) {
			   IO.println(i+" by "+t.getName());
		  }
			  }
	}
}

class Even extends Thread{
	@Override
   public void run() {
		  IO.println("Even Thread Started ");
		  for(int i =1;i<=100;i++) {
			  
			  Thread t = Thread.currentThread();
			 
			  if(i%2==0) {
			   IO.println(i+" by "+t.getName());
		  }
		  }
	}
}



public class EvenOdd {

	public static void main(String[] args) throws InterruptedException {
		IO.println("Main thread");
		Odd oddThread = new Odd();
		Even evenThread =new Even();
		
		oddThread.start();
		oddThread.join();
		
		evenThread.start();
		
		evenThread.join();
		
		

	}

}
