package com.inheritance.basics;

import java.util.Scanner;

class Manager{
	protected String name;
	protected int id;
	protected double salary;
	public Manager(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
}
class Developer extends Manager{
	protected String name;
	protected int id;
	protected double salary;
	
	public Developer(String name, int id, double salary) {
		super(name, id, salary);
		name =super. name;
		id = super.id;
		salary = super.salary;
	}
	

	@Override
	public String toString() {
		return "Developer [name=" + super.name + ", id=" + this.id + ", salary=" + this.salary + "]";
	}
	
	
	
	
	
	
	
}

public class VariablHiding {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Name: ");
     String name = sc.nextLine();
     System.out.print("Enter the id: ");
     int id = Integer.parseInt(sc.nextLine());
     System.out.print("Enter Salary: ");
     double salary = Double.parseDouble(sc.nextLine());
     
     Developer developer  = new Developer(name,id,salary);
     System.out.println(developer);
	}

}
