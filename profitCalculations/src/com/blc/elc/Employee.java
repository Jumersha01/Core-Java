package com.blc.elc;

public class Employee {
private int id;
private String name;
private  double salary;

public void  setEmployeeDetails(int id,String name,double salary) {
	this.id =id;
	this.name=name;
	this.salary=salary;
	System.out.println("");
	
}
public void  calculateSalaryIncrement() {
	double salaryIncrement=0;
	if(this.salary<50000) {
		salaryIncrement=(salary*0.10);
		this.salary +=salaryIncrement;
	}
	else if(this.salary>50000&&this.salary<80000) {
		salaryIncrement=(salary*0.07);
		this.salary+=salaryIncrement;
	}
	else {
		salaryIncrement=(salary*0.05);
		this.salary +=salaryIncrement;;
	}
	System.out.println("Salary increamet amount : "+salaryIncrement);
	System.out.println("After increament, Updated salary : "+this.salary);
}

public String toString() {
	
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}


}
