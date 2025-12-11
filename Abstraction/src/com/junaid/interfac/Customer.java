package com.junaid.interfac;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Total Bill Amount :");
		double totalAmount = Double.parseDouble(sc.nextLine());

		System.out.println("Choose payments Method:");
		int opt = Integer.parseInt(sc.nextLine());

		switch (opt) {
		case 1 -> {
			Payments pay = new CreditPayments("Mr Ravi");
			ShoppingCard sh = new ShoppingCard(totalAmount);
			sh.checkout(pay);
			System.out.println();
			sh.cancelOrder(pay);
		}
		case 2 -> {
			Payments pay = new DebitCardPayments("State Bank Of India");
			ShoppingCard sh = new ShoppingCard(totalAmount);
			sh.checkout(pay);
			System.out.println();
			sh.cancelOrder(pay);
		}
		case 3 -> {
			Payments pay = new UPIPayments("reach _scott@upi");
			ShoppingCard sh = new ShoppingCard(totalAmount);
			sh.checkout(pay);
			System.out.println();
			sh.cancelOrder(pay);
		}
		default -> System.out.println("Choose a Valid Option");
		}

	}

}

sealed interface Payments permits CreditPayments, DebitCardPayments, UPIPayments {
	void makePayment(double amount);

	void makeRefund(double amount);
}

final class CreditPayments implements Payments {

	private String cardHoldersName;

	public CreditPayments(String cardHoldersName) {
		super();
		this.cardHoldersName = cardHoldersName;
	}

	public void makePayment(double amount) {
		System.out.println("Paid RS :" + amount + " using Credit Card Holder :" + cardHoldersName);
	}

	public void makeRefund(double amount) {
		System.out.println("Cancelling order for amount RS :" + amount);
		System.out.println("Refunded RS :" + amount + " to Credit Card Holder :" + cardHoldersName);
	}

}

final class DebitCardPayments implements Payments {

	private String bankName;

	public DebitCardPayments(String bankName) {
		super();
		this.bankName = bankName;
	}

	public void makePayment(double amount) {
		System.out.println("Paid RS :" + amount + " using Debit Card :" + bankName);
	}

	public void makeRefund(double amount) {
		System.out.println("Cancelling order for amount RS :" + amount);
		System.out.println("Refunded RS :" + amount + " to Debit Card Bank :" + bankName);
	}

}

final class UPIPayments implements Payments {
	private String upiId;

	public UPIPayments(String upiId) {
		super();
		this.upiId = upiId;
	}

	public void makePayment(double amount) {

		System.out.println("Paid RS :" + amount + " using UPI ID :" + upiId);
	}

	public void makeRefund(double amount) {

		System.out.println("Cancelling order for amount RS :" + amount);
		System.out.println("Refunded RS :" + amount + " to UPI ID :" + upiId);

	}

}

class ShoppingCard {
	private double totalAmount;

	public ShoppingCard(double totalAmount) {
		super();
		this.totalAmount = totalAmount;
	}

	public void checkout(Payments payments) {
		System.out.println("Starting checkout for amount RS :" + totalAmount);
		payments.makePayment(totalAmount);

	}

	public void cancelOrder(Payments payments) {
		IO.println("Hellow");
		payments.makeRefund(totalAmount);
	}
}
