package com.student.marks;

public class Scholarship {
	private Student student;
	private String scholarship;
	

	public Scholarship(Student s,String scholer) {
		this.student=s;
		this.scholarship=scholer;
		
	}


	@Override
	public String toString() {
		return "The student " + this.student + " has Recieved " + this.scholarship + " Scholership";
	}
	

}
