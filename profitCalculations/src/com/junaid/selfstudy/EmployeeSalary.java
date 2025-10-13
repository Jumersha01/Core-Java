package com.junaid.selfstudy;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int salary = 10000;
		
		System.out.println("Enter the Grade of Employee : ");
		char grade = sc.next().toUpperCase().charAt(0);
		
		double bonus = switch(grade) {
		case 'A','B'->{
			System.out.println("You are Grade A || B Employee");
			yield salary*0.20;
		}
		case 'C'->{
			System.out.println("You are Grade C Employee");
			yield salary*0.15;
		}
		case 'D'->{
			System.out.println("You are Grade D Employee");
			yield salary*0.10;
		}
		default ->0.0;
		};
		
		System.out.println("Your Bonus based on your grade is :"+bonus);
		

	}

}
