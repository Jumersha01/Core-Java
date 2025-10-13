package com.junaid.selfstudy;

import java.util.Scanner;

class Student{
	String studentName;
	int rollNo;
	char studentGrade;
	static  String colleg="Umeshwar Madhyamik Vidyalaya,Dansur";


  public void setData(String name,int roll,char grade) {
	  
	  studentName=name;
	  rollNo=roll;
	  studentGrade=grade;
	  
  }
  public void getData() {
	  System.out.println("The name of the Student is :"+studentName);
	  System.out.println("The roll no of the Student is : "+rollNo);
	  System.out.println("The grade of the Student is :"+studentGrade);
	  System.out.println("The schoole name of the Student is :"+ colleg);
  }
}

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the name of the Student");
	String name = sc.nextLine();
	
	System.out.print("Enter the roll no of the Student");
	int roll = Integer.parseInt(sc.nextLine());
	
	System.out.print("Enter the grade of the Student");
	char grade = sc.next().charAt(0);
	
	s1.setData(name, roll, grade);
	s1.getData();
	System.out.println("-----------------------------------------");
	
		
		 

	}

}
