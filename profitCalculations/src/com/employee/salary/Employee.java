package com.employee.salary;

public class Employee {

	private String employeeName;
	private int experience;
	Employee(String employeeName,int experience){
		this.employeeName=employeeName;
		this.experience=experience;
	}
	public int getExperience() {
		return this.experience;
	}
	
	@Override
	public String toString() {
		return ""+this.employeeName;
	}

	
}
