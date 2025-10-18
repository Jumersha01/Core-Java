package com.blc.elc;

public class Employees {
private String firstName;
private String lastName;
private int employeeId;
private double salary;
private int noOfProjects;

public Employees(String firstName,String lastName,int employeeId,double salary,int noOfProjects) {
	this.firstName=firstName;
	this.lastName = lastName;
	this.employeeId =employeeId;
	this.salary=salary;
	this.noOfProjects=noOfProjects;
}


public String toString() {
	return "Employees [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", salary="
			+ salary + ", noOfProjects=" + noOfProjects + "]";
}

public void calculateSalary() {
	if(noOfProjects<=0) {
		System.err.println("Number of projects cannot be negative");
		System.out.println("Salary remains "+salary);
		System.exit(0);
	}
	else if(noOfProjects>5&&noOfProjects<10) {
		salary+=5000;
	}
	else if(noOfProjects>10&&noOfProjects<20) {
		salary+=10000;
	}
	else {
		salary+=15000;
	}
	System.out.println("updated Salary to :"+salary);
	
}

}
