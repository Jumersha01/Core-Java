package com.blc.elc;

import java.util.Scanner;

class Balance{
	private double principle;
	private double interestRate;
	private int durationMonths;
	
	Balance(double principle,double interestRate,int durationMonths){
		this.principle=principle;
	    this.interestRate=interestRate;
	    this.durationMonths=durationMonths;
	    if(this.principle<=0||this.interestRate<=0||this.durationMonths<=0) {
	    	System.err.println("Error");
	    	System.exit(0);
	    }
	    
	}

	public double getPrinciple() {
		return principle;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public int getDurationMonths() {
		return durationMonths;
	}

	
}
public class BalancePrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Loan Amount :");
		double amount = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter Loan Rate :");
		double rate = Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter Loan Amount :");
		int month = Integer.parseInt(sc.nextLine());
		
	   Balance b1 = new Balance(amount,rate,month);
	     
	   System.out.println("Principal: "+b1.getPrinciple());
	   
	   System.out.println("Interest Rate (Yearly %) :"+b1.getInterestRate());
        		
	   System.out.println("Duration (months): "+b1.getDurationMonths());	 
		
		

	}

}
