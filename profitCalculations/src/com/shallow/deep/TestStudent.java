package com.shallow.deep;


class Student{
	private String name;
	private int rollNumber;
	private char grade;
	
	Student(String name,int rollNumber,char grade){
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade = grade;
		
	}

	
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", grade=" + grade + "]";
	}
	public static Student createStudents(String name,int rollNumber,char grade) {
		return new Student(name,rollNumber,grade);
	}
	
}
public class TestStudent {

	public static void main(String[] args) {
		Student s1 = Student.createStudents("Junaid", 36, 'A');
		System.out.println(s1.toString());
	}

}
