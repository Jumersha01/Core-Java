package com.junaid.method_overriding;

import java.util.Scanner;
public class BankApplicaton {
	


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Choice (1-Saving, 2-Current, 3-Fixed Deposit): ");
	        int choice = Integer.parseInt(sc.nextLine());

	        System.out.println("Enter Account Holder Name: ");
	        String acHolderName = sc.nextLine();

	        System.out.println("Enter Account Number: ");
	        String acNumber = sc.nextLine();

	        System.out.println("Enter Balance: ");
	        double balance = Double.parseDouble(sc.nextLine());

	        if (balance <= 0) {
	            System.out.println("Balance cannot be negative.");
	            System.exit(0);
	        }

	        switch (choice) {
	            case 1 -> {
	                BankAccount b = new SavingAccount(acHolderName, acNumber, balance);
	                b.displayAccountDetails();
	                b.calculateInterst();
	            }

	            case 2 -> {
	                BankAccount c = new CurrentAccount(acHolderName, acNumber, balance);
	                c.displayAccountDetails();
	                c.calculateInterst();
	                CurrentAccount ca = (CurrentAccount) c;
	                ca.checkOverDraftLimit();
	            }

	            case 3 -> {
	                System.out.println("Enter Deposit Term (in years): ");
	                int term = Integer.parseInt(sc.nextLine());

	                if (term < 0) {
	                    System.out.println("Deposit term must be positive.");
	                    System.exit(0);
	                }

	                BankAccount f = new FixedDeposit(acHolderName, acNumber, balance, term);
	                f.displayAccountDetails();
	                f.calculateInterst();
	            }

	            default -> System.out.println("Invalid Choice");
	        }

	        sc.close();
	    }
	}

	class BankAccount {
	    protected String acHolderName;
	    protected String acNumber;
	    protected double balance;
	    public static final String IFSC_CODE = "SBIHYD151285";

	    BankAccount(String acHolderName, String acNumber, double balance) {
	        this.acHolderName = acHolderName;
	        this.acNumber = acNumber;
	        this.balance = balance;
	    }

	    public void calculateInterst() {
	        System.out.println("Generic Interest");
	    }

	    public void displayAccountDetails() {
	        System.out.println("Account Holder: " + this.acHolderName);
	        System.out.println("Account Number: " + this.acNumber);
	        System.out.println("Balance RS :" + this.balance);
	        System.out.println("IFSC CODE :" + IFSC_CODE);
	    }
	}

	class SavingAccount extends BankAccount {
	    protected double interest = 4.0;

	    SavingAccount(String acHolderName, String acNumber, double balance) {
	        super(acHolderName, acNumber, balance);
	    }

	    public void calculateInterst() {
	        System.out.println("Savings Account Interest RS :" + (balance * interest) / 100);
	    }
	}

	class CurrentAccount extends BankAccount {
	    protected double overDraftLimit = 5000.0;

	    CurrentAccount(String acHolderName, String acNumber, double balance) {
	        super(acHolderName, acNumber, balance);
	    }

	    public void calculateInterst() {
	        System.out.println("Current accounts do not earn interest.");
	    }

	    public void checkOverDraftLimit() {
	        System.out.println("Overdraft limit RS :" + overDraftLimit);
	    }
	}

	class FixedDeposit extends BankAccount {
	    protected double interestRate = 6.5;
	    protected int depositeTerm;

	    FixedDeposit(String acHolderName, String acNumber, double balance, int depositeTerm) {
	        super(acHolderName, acNumber, balance);
	        this.depositeTerm = depositeTerm;
	    }

	    public void calculateInterst() {
	        double intrestPerYear = (interestRate / 100) * balance;
	        System.out.println("Fixed Deposit Interest for " + depositeTerm +
	                " years RS :" + (intrestPerYear * depositeTerm));
	    }
	}



