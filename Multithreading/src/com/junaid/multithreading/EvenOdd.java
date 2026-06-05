package com.junaid.multithreading;

class Even implements Runnable{
    int arr[]= {1,2,3,4,5,6,7,8,9,10,11};
	
	public void getEven( int arr[]){
		String even = "";
		for(int num:arr) {
			if(num%2==0) {
				even+=" "+num;
			}
		}
		System.out.println(even);
	}
	
	@Override
	public void run() {
		this.getEven(arr);
		
	}
	
}
class Odd implements Runnable{

	 int arr[]= {1,2,3,4,5,6,7,8,9,10,11};
	public void getOdd( int arr[]){
		String odd = "";
		for(int num:arr) {
			if(num%2!=0) {
				odd+=" "+num;
			}
		}
		System.out.println(odd);
	}
	@Override
	public void run() {
		
		this.getOdd(arr);
	}
	
}
public class EvenOdd {

	public static void main(String[] args) {
	   Even even  = new Even();
	   Odd odd = new Odd();
	   Thread t1 = new Thread(even);
	   Thread t2 = new Thread(odd);
	   t1.start();
	   t2.start();
	   
		
	}

}
