package com.junaid.method_overriding;

import java.util.Scanner;

class Employee{
	protected int id;
	protected String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public  double calculateSalary() {
		return 0.0;
	}
	
}
class FullTimeEmployee extends Employee{
protected double salary;
FullTimeEmployee(int id,String name,double salary){
	super(id,name);
	this.salary=salary;
}

public double calculateSalary() {
	return this.salary;
	
}
	
}

class PartTimeEmployee extends Employee{
	protected double hourlyRate;
	protected int hourWorked;
	public PartTimeEmployee(int id, String name, double hourlyRate, int hourWorked) {
		super(id, name);
		this.hourlyRate = hourlyRate;
		
		this.hourWorked = hourWorked;
	}
	public double calculateSalary() {
		return (hourWorked*hourlyRate);
		
	}
	
	
	
}

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
				
		System.out.println("****Salary Calculation Menu****");
		System.out.println("1). FullTime Employees: ");
		System.out.println("2). PartTime Employees: ");
		
		System.out.println("Please select the Employee Type.");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		switch(choice) {
		case 1 ->{
			System.out.print("Enter Fulltime Employee id: ");
			int id = Integer.parseInt(sc.nextLine());
			if(id<=0) {
				System.out.println("Employee id can't be negative!!!");
				System.exit(0);
			}
			
			System.out.print("Enter Fulltime Employee name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter Fulltime Employee salary: ");
			double salary = Double.parseDouble(sc.nextLine());
			if(salary<=0) {
				System.out.println("Salary can't be negative!!!");
				System.exit(0);
			}
			
			FullTimeEmployee e = new FullTimeEmployee(id,name,salary);
			System.out.println(e.name+" Salary is "+e.calculateSalary());
			
			
		}
		case 2 ->{
			System.out.print("Enter Parttime Employee id: ");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Parttime Employee name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter hourly Rate: ");
			double hourlyRate = Double.parseDouble(sc.nextLine());
			if(hourlyRate<=0) {
				System.out.println("Employee hourly rate can't be zero OR Negative");
				System.exit(0);
			}
			
			System.out.print("Enter your total work hour in the month : ");
			int workHour = Integer.parseInt(sc.nextLine());
			
			PartTimeEmployee e = new PartTimeEmployee(id,name,hourlyRate,workHour);
			
			System.out.println(e.name+" Salary is "+e.calculateSalary());
			
			
			
			
			
		}
		}
		

	}

}
