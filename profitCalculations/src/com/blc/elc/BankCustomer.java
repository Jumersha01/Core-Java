package com.blc.elc;

import java.util.Scanner;

public class BankCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank c1 = new Bank();
	Scanner sc =new Scanner(System.in);
	System.out.println("===== Welcome to "+Bank.bankName+" Bank=====");
	
	System.out.print("Enter the Customer Name : ");
	String name = sc.nextLine();
	
	System.out.print("Enter Account Number : ");
	int accountNum = Integer.parseInt(sc.nextLine());
	
	
	System.out.print("Enter Opening Balance : ");
	double balance = Double.parseDouble(sc.nextLine());
	c1.setCustomerDeatils(name, accountNum, balance);
	
	
	System.out.println("=====Menu=====");
	System.out.println("1.Desposit\n"
			+ "2.Withdraw\n"
			+ "3.Check Balance\n"
			+ "4.Display Customer Details\n"
			+ "5.Exit\n");
	
	while(true) {
		System.out.print("Enter your choice : ");
		int choice = Integer.parseInt(sc.nextLine());

		switch(choice) {
		case 1->{
			System.out.print("Enter the deposit Amount : ");
			double depositAmount = Double.parseDouble(sc.nextLine());
			c1.deposit(depositAmount);
		}
		case 2->{
			System.out.print("Enter the withdrawal Amount : ");
			double withdrawaltAmount = Double.parseDouble(sc.nextLine());
			c1.withdraw(withdrawaltAmount);
		}
		case 3->{
			System.out.print("Your Current Balance is : "+c1.getCurrentBalance());

			
		}
		case 4->{
			System.out.print(c1.displayDeatails());
			
		}
		case 5->{
			System.out.print("Thanks for visiting "+Bank.bankName+" Bank");
			sc.close();
			System.exit(0);
		}
		default -> System.err.println("Invalid Choice is not listed");
	
		
		
		}
	}
	
		

	}

}
