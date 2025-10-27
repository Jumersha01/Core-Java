package com.student.grade;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   
	   String name = sc.nextLine();
	   
	   
	   int mark = Integer.parseInt(sc.nextLine());
	   
	   Student s1 = new Student(name,mark);
	 StudentGrade grade = CalculateStudentGrade.calculateGrade(s1);
	 System.out.println(grade);
	 sc.close();
	 
   
	}

}
