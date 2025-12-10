//Write a program to implement an interface Payable with method pay() using amount to pay.
//
//Two classes Employee and Contractor implement it using anonymous inner class.
package com.junaid.interfac;

interface Payable{
	void pay(double amount);
}
class Employee{
	
	Payable  payment = new Payable() {
		public void pay(double amount) {
			System.out.println("Amount paid to the Employee"+amount);
		}
	};
}
class Contractor{
		Payable  payment = new Payable() {
		public void pay(double amount) {
			System.out.println("Amount paid to the Constractor"+amount);
		}
	};
	
}
public class EmployeesPayments{
	public static void main(String [] args) {
		Employee e = new Employee();
		Contractor c = new Contractor();
		e.payment.pay(12000);
		c.payment.pay(14000);
		
	}  
}



