package com.student.marks;

public class Student {
	private String studentName;
	private double percentage;

	public Student(String studentName,double percentage) {
		this.studentName=studentName;
		this.percentage=percentage;
		
	}
	public double getPercentage() {
		return this.percentage;
	}
	@Override
	public String toString() {
		return ""+this.studentName;
	}
	

}
