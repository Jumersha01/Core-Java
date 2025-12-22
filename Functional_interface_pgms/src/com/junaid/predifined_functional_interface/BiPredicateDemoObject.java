package com.junaid.predifined_functional_interface;

import java.util.function.BiPredicate;

record StudentA(String name,int age,int attendancePercentage,boolean feesPaid) {
	
}
public class BiPredicateDemoObject {
void main() {
	BiPredicate<StudentA,String> eligibilty = (student,str)->{
		boolean isElig= ((student.age()>=18 && student.attendancePercentage()>=75) && (student.feesPaid()));
		boolean etype = str.equalsIgnoreCase("COMPARTMENT")?student.attendancePercentage()>85:str.equalsIgnoreCase("Regular")?true:false;
		return (isElig)&&(etype);
	};
	
	String name = IO.readln("Enter Student name:");
	int age = Integer.parseInt(IO.readln("Enter Student Age: "));
	int attendace =Integer.parseInt(IO.readln("Enter Student Addendace: ")); 
	boolean fees = Boolean.parseBoolean(IO.readln("Student paid fees or not: "));
	
	String examtype = IO.readln("Enter exam type of student: ");
	StudentA s = new StudentA(name,age,attendace,fees);
	
	
	
	IO.println("Is Student eligible :"+eligibilty.test(s, examtype));
}
}
