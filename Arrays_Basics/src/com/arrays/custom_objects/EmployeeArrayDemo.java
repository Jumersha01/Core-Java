package com.arrays.custom_objects;

import java.util.Scanner;

public class EmployeeArrayDemo {

	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		
		System.out.print("Enter number of employees:");
		int n = Integer.parseInt(sc.nextLine());
		
		if(n<=0) {
			System.out.println("Invalid Array size");
			System.exit(0);
		}
		
		Employee employee [] = new Employee[n];
		
		for(int i =0;i<n;i++) {
			System.out.println("Enter details for Employee "+(i+1)+":"+"\n");
			
			System.out.print("Enter ID: ");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter Salary: ");
			double salary = Double.parseDouble(sc.nextLine());
			
			employee[i] = new Employee(id,name,salary);
		}
		
		System.out.println("++++++++++++Employee Details+++++++++++++");
		for(Employee e:employee) {
			System.out.println(e);
		}
		
		

	}

}
