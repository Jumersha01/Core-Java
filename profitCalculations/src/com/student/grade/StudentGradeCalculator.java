package com.student.grade;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter the Student Name:");
	   String name = sc.nextLine();
	   
	   System.out.print("Enter the Student Marks :");
	   int mark = Integer.parseInt(sc.nextLine());
	   
	   Student s1 = new Student(name,mark);
	 StudentGrade grade = CalculateStudentGrade.calculateGrade(s1);
	 System.out.println(grade);
	 
   
	}

}
