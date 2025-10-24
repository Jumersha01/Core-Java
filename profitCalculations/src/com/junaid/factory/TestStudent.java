package com.junaid.factory;

import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private String grade;
	
	private Student(String name,int age,String grade) {
		this.name=name;
		this.age =age;
		this.grade = grade;
	}
	public static Student createStudentObject(String name,int age,String grade) {
		Student s1 = new Student(name,age ,grade);
		return s1;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
}

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter Student name :");
			String name = sc.nextLine();
			
			System.out.print("Enter Student age :");
			int age = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Student Grade :");
			String grade = sc.nextLine();
			
			Student s1 = Student.createStudentObject(name, age, grade);
			System.out.println(s1.toString());
			   
			System.out.print("Enter the choice for Creating the object:");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("no")) {
				System.exit(0);
			}
		}
		
	}

}
