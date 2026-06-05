package com.junaid.multithreading;

class WriteTable implements Runnable{
	
	Integer number;
	
	WriteTable(Integer number){
		
		this.number=number;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("table Thread");
	System.out.println("Table thread started: ");
		table(this.number);
		System.out.println("Table thread ended: "+Thread.currentThread().getName());
	}
	public void table(Integer number) {
		for(int  i =1;i<=number;i++) {
			System.out.println(i+" X "+(i*number));
		}
	}
	
}

public class CustomThread {
  public static void main(String [] args) {
	  System.out.println("Main started: "+Thread.currentThread().getName());
	  
	  WriteTable write = new WriteTable(22);
	   
	  
	  Thread t  = new Thread(write);
	  t.start();
	 
	 System.out.println("Main thread Ended: ");
	 
  }
}
