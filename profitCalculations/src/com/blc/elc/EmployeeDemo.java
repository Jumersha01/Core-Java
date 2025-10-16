package com.blc.elc;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee m1 =new Employee();
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Employee ID : ");
	int id = Integer.parseInt(sc.nextLine());
	
	System.out.print("Enter Employee Name : ");
	String name = sc.nextLine();
	
	
	System.out.print("Enter Employee Salary : ");
	double salary = Double.parseDouble(sc.nextLine());
	
	m1.setEmployeeDetails(id, name, salary);

	System.out.println("----- Employee Information -----");
	System.out.println("Employee Details :\n"+m1);
	
	System.out.println("----- Salary Increment Details -----");
	m1.calculateSalaryIncrement();
	
	
	
	

	}

}
