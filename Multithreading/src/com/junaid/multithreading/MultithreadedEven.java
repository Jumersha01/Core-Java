package com.junaid.multithreading;

class B{
	private boolean flag = false;
	
	public synchronized void even(int num) {
		while(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		if(num%2==0) {
			System.out.println("Even No: "+num);
			notify();
			flag =true;
		}
	}
	public synchronized void odd(int num) {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		if(num%2!=0) {
			System.out.println("Odd No: "+num);
			flag= false;
			notify();
		}
	}
}

public class MultithreadedEven {

	public static void main(String[] args) {
	  B b = new B();
		Runnable r1 = ()->{
			for(int i=0;i<=10;i++) {
				b.even(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};
		
		Runnable r2 = ()->{
			for(int i=0;i<=10;i++) {
				b.odd(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
       
	}

}
