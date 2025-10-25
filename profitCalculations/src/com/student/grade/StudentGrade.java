package com.student.grade;

public class StudentGrade {
  private Student student;
  private char studentGrade;
  
  public StudentGrade(Student student, char studentGrade) {
	
	this.student = student;
	this.studentGrade = studentGrade;
  }
  
  public void setStudentGrade(char studentGreade) {
	  this.studentGrade=studentGrade;
	  
  }
   public char getStudentGrade() {
	   return this.studentGrade;
   }
   public Student getStudent(Student student) {
	   return student;
   }
   public void setStudent(Student student) {
	   this.student=student;
   }

   @Override
   public String toString() {
	return "The Student " + this.student.getName() + " has " + this.studentGrade+"Grade";
   }
   
  
  
  
}
