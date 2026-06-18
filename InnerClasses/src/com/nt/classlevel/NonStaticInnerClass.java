package com.nt.classlevel;

class Student{
	
	Integer studentId;
	String name;
	String address;
	
	 class Address{
		 
		 public void show() {
			 System.out.println("Address is: "+Student.this.address);
		 }
		 
		 Address(String address){
			 Student.this.address=address;
		 }
	 }
	 Student(Integer id,String name){
		 this.studentId=id;
		 this.name=name;
		
	 }
	 Student(){
		 
	 }
	 public String toString() {
		 return "Student name is: "+this.name+"Student id:"+this.studentId+"Student Address:"+this.address;
	 }
}
public class NonStaticInnerClass {
  void main() throws InterruptedException {
	  Student.Address addres=new Student().new Address("Pune");
	  Student s = new Student(101,"Junaid");
	 
	  System.out.print(s);
	  
  }
}
