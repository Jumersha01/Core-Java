package com.junaid.factory;

import java.util.Scanner;

class Employee{
	  private String name;
	  private int id;
	  private String department;
	  private double salary;
	  
	  private Employee(String name,int id,String department,double salary) {
		  this.name=name;
		  this.id =id;
		  this.department=department;
		  this.salary=salary;
	  }
	  public  static Employee  createEmployeeObject( String name,int id,String department,double salary) {
		  return new Employee (name,id,department,salary);
		  
	  }
	  @Override
	  public String toString() {
		return "Employee Name:" + name + ", ID:" + id + ", Department:" + department + ", Monthtly Salary:" + salary + "\n Annual Salary With (With Bonus): "+calculateAnnualSalary();
	  }
	  public  double  calculateAnnualSalary()
	  {
		  
		  double salary = (this.salary*12);
		 double bonus =switch(this.department) {
		  case "sale"->salary*0.10;
		  case "engineering"->salary*0.15;
		  case "hr"->salary*0.08;
		  default->salary*0.05;
		  };
		 
		  return salary+bonus;
	  }
	  
  }
public class TestEmployee {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while(true) {
			System.out.println("--- Employee Details ---");
			
			System.out.println("Enter details for Employee "+count+":");
			count++;
			
			   System.out.print("Enter Employee Name:");
			   String name = sc.nextLine();
			   
			   System.out.print("Enter Employee ID: ");
			   int id = Integer.parseInt(sc.nextLine());
			   
			   System.out.print("Enter Department");
			   String department = sc.nextLine().toLowerCase();
			   
			   System.out.print("Enter Monthly Salary: ");
			   double salary = Double.parseDouble(sc.nextLine());
			   
			   Employee m1 = Employee.createEmployeeObject(name, id, department, salary);
			   System.out.println(m1);
					   
			   
			   System.out.println("Enter the choice for creating the object:");
			   String choice = sc.nextLine();
			   if(choice.equalsIgnoreCase("no")) {
				   System.exit(0);
			   }
			   
			   
		}

	}

}
