package com.blc.elc;

import java.util.Scanner;

public class EmployeesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.print(" firstName :");
		String firstName=sc.nextLine();
		
		System.out.print(" lastName:");
		String lastName =sc.nextLine();
		
		System.out.print(" employeeId:");
		int eId = Integer.parseInt(sc.nextLine());
		
		System.out.print("salary:");
		double salary = Double.parseDouble(sc.nextLine());
		
		System.out.print(" NoOfProject:");
		int project = Integer.parseInt(sc.nextLine());
		
		Employees e1 = new Employees(firstName,lastName,eId,salary,project);
		e1.calculateSalary();
		

	}

}
