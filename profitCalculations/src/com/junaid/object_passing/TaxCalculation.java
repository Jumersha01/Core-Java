package com.junaid.object_passing;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Tell us Who Are You---");
		System.out.println("1. Employee");
		System.out.println("2. Manager");
		System.out.println("3. Trainer");
		System.out.println("4. Sourcing");
		System.out.println("5. Exit");
		
		while(true) {
			System.out.print("Enter your choice Here :");
			int  choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			  
			case 1->{
				System.out.println("Enter the Employee id: ");
				int id =Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter the Employee name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter the Employee basic Salary");
				double basicSalary=Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Employee HRAPer:");
				double HRAper = Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Employee DAPer:");
				double DAper =Double.parseDouble(sc.nextLine());
				
				Employee e = new Employee(id,name,basicSalary,HRAper,DAper);
				
				System.out.println("The Salary after tax Calculation :"+TaxUtil.calculateTax(e));
				break;
			}
			case 2 ->{
				
				System.out.println("Enter the Manager id: ");
				int id =Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter the Manager name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter the Manager basic Salary");
				double basicSalary=Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Manager HRAPer:");
				double HRAper = Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Manager DAPer:");
				double DAper =Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Manager Project Allowance: ");
				double projectAllowance = Double.parseDouble(sc.nextLine());
				

				
				Manager m = new Manager(id,name,basicSalary,HRAper,DAper,projectAllowance);
				
				System.out.println("The Salary after tax Calculation :"+TaxUtil.calculateTax(m));
				break;
				
			}
			case 3->{
				System.out.println("Enter the Trainer id: ");
				int id =Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter the Trainer name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter the Trainer basic Salary");
				double basicSalary=Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Trainer HRAPer:");
				double HRAper = Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Trainer DAPer:");
				double DAper =Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Trainer BatchCount:");
				int batch = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter the Trainer PerkPerBatch: ");
				double projectAllowance = Double.parseDouble(sc.nextLine());
				
				Trainer t = new Trainer(id,name,basicSalary,HRAper,DAper,batch,projectAllowance);
				
				System.out.println("The Salary after tax Calculation :"+TaxUtil.calculateTax(t));
				break;
				
				
			}
			case 4 ->{
				System.out.println("Enter the Source  id: ");
				int id =Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter the Source  name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter the Source basic Salary");
				double basicSalary=Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Source HRAPer:");
				double HRAper = Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Source DAPer:");
				double DAper =Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Source Enrollment Target:");
				double enrollmentTarget=Double.parseDouble(sc.nextLine());
				
				System.out.println("Enter the Source enrollmentReached:");
				int enrollmentReached = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter the  Source perkPerEnrollment;: ");
				int perkPerEnrollment = Integer.parseInt(sc.nextLine());
				
				Sourcing s = new Sourcing(id,name,basicSalary,HRAper,DAper,enrollmentTarget,enrollmentReached,perkPerEnrollment);
				
				System.out.println("The Salary after tax Calculation :"+TaxUtil.calculateTax(s));
				break;
				
			}
			default->{System.out.println("Option is not Available (Exited)");
			System.exit(0);
			sc.close();
			}
			  
			}
			
			
		}
		
		

	}

}
