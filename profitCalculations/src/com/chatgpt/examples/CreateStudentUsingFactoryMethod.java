package com.chatgpt.examples;

 class Student{
	 private String names;
	 
	 Student(String name){
		 this.names = name; 
	 }
	 public static Student createStudent(String name)
	 {
		 return new Student(name);
		 }
	 
	 public String toString() {
		return "Student [names=" + names + "]";
	 }
	 
	 }

public class CreateStudentUsingFactoryMethod {

	public static void main(String[] args) {
		Student s1= Student.createStudent("Junaid");
		System.out.println(s1.toString());

	}

}
