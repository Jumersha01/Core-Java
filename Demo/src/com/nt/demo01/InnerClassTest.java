package com.nt.demo01;

interface Vehicle{
	void run();
}
public class InnerClassTest {
 void main() {
 new Vehicle() {
		 @Override
		 public void run() {
			 System.out.println("Vehicle car is runnig...");
		 }
	 }.run();;
	
 }
}
