package com.student.grade;

 class CalculateStudentGrade {
 public static StudentGrade calculateGrade(Student student) {
	 int studentMark = student.getMarks();
	 char grade=0;
	 if(studentMark>90) {
		 grade='A';
	 }
	 else if(studentMark>=75) {
		 grade='B';
	 }
	 else   if(studentMark>=60) {
		 grade='B';
	 }
	 else {
		 grade='D';
	 }
	return new StudentGrade(student,grade);
	 
 }
}
