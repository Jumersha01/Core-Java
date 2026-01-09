package com.junaid.arraylist;

import java.util.ArrayList;

public class CustomerService {
	private ArrayList<Customer> customer ;

	CustomerService() {
		this.customer= new ArrayList<>();
	}

	public void addCustomer(Customer customers) {
		this.customer.add(customers);
	}

	private boolean isFirstCustomer(Customer customers) {

		boolean isExist = false;
		for (int i = 0; i < customer.size(); i++) {
			if (customer.get(i).phone().equals(customers.phone())) {
				
				isExist = true;
			}
		}
		return isExist;
	}

	public double calculateBill(Customer customers) {
		double bill = 0;
		if (this.isFirstCustomer(customers)) {
			if (customers.distance() <= 4) {
				bill = 80;

			} else {
				bill = 80;
				bill += (customers.distance() * 6);
			}
		}
		
		return bill;


	}
	public void printBill(Customer cust) {
		
			IO.println(cust.customerName()+" please pay your bill Rs: "+this.calculateBill(cust));
			
		
	}

	
}
