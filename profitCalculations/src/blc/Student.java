package blc;

public class Student {

	int studentId;
	String studentName;
	int studentMarks;
	char studentGrade;
	
	public void setStudentData(int id,String name,int marks) {
		studentId=id;
		studentName=name;
		studentMarks=marks;
		
		}
	public void calculateGrade(int marks) {
		studentMarks=marks;
		if(studentMarks>=90) {
			studentGrade ='A';
		}
		else if(studentMarks>=80&&studentMarks<90) {
			studentGrade ='B';
		}
		else if(studentMarks>=70&&studentMarks<80) {
			studentGrade='C';
		}
		else if(studentMarks>=60&&studentMarks<70) {
			studentGrade='D';
		}
		else {
			studentGrade='E';
		}
		
		
	 	}
	public String displayDetails() {
		
		return "[ name = "+studentName+", studentId="+studentId+", marks="+studentMarks+", grade "+studentGrade;
	}
}
