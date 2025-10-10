package com.junaid.object;

public class DogBehav {
    int age;
      String name;
       double weihgt;
        public  void getDogInfor() {
        	System.out.println("My name is :"+name);
        }
        public  void bark() {
        	System.out.println("Dog is barking :");
        }
	public static void main(String[] args) {
	   	DogBehav tomy = new DogBehav();
	   	tomy.name="Prince";
	   	tomy.age=16;
	   	tomy.weihgt=13.5;
	   	
	   	tomy.getDogInfor();
	   	tomy.bark();
         
	   	
	} 

}
