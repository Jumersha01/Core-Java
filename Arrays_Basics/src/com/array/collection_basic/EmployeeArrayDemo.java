package com.array.collection_basic;

import java.util.Scanner;

public class EmployeeArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size  = Integer.parseInt(IO.readln("Enter number of Employees"));
		
	  Employee employees[] = new Employee[size];
	  
	  for(int i =0;i<size;i++) {
		  IO.println("");
		  IO.println("Enter details of Employee "+(i+1));
		  int id = Integer.parseInt(IO.readln("Enter id of Employee: "));
		  String name = IO.readln("Enter name of Employee: ");
		  double salary = Double.parseDouble(IO.readln("Enter Salary of Employee:"));
		  
		  employees[i] = new Employee(id,name,salary);
		
	  }
	  IO.println("");
	  IO.println("Employees details:-");
	  for(Employee em:employees) {
		  IO.println(em);
	  }

	}

}
