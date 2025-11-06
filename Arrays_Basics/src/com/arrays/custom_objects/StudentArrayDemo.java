package com.arrays.custom_objects;

import java.util.Scanner;

public class StudentArrayDemo {

	public static void main(String[] args) {
	 Scanner sc  = new Scanner(System.in);
	  
	 Student student[]= new Student[3];
	 
	 for(int i =0;i<student.length;i++) {
		 
		 System.out.print("Enter the "+(i+1)+"th Student id: ");
		 int id = Integer.parseInt(sc.nextLine());
		 
		 System.out.print("Enter the "+(i+1)+"th Student name: ");
		 String name = sc.nextLine();
		 
		 System.out.print("Enter the "+(i+1)+"th Student makrs: ");
		 double marks = Double.parseDouble(sc.nextLine());
		 
		  student[i] = new Student(id,name,marks);
	 }
	 
	 for(Student data : student) {
		 System.out.println(data);
	 }
	 
	 
	}

}
