package com.junaid.method_overloading;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payment payment = new Payment();

		System.out.println("Enter Choice:");
		System.out.println("1. Cash Payment");
		System.out.println("2. Credit Card Payment");
		System.out.println("3. Debit Card Payment");
		int choice = Integer.parseInt(sc.nextLine());

		switch (choice) {
		case 1 -> {
			System.out.print("Enter Amount: ");
			double amount = Double.parseDouble(sc.nextLine());
			payment.makePayment(amount);
		}

		case 2 -> {
			System.out.print("Enter Card Holder Name: ");
			String cardHolder = sc.nextLine();
			System.out.print("Enter Credit Card Number: ");
			String cardNumber = sc.nextLine();
			System.out.print("Enter Amount: ");
			double amount = Double.parseDouble(sc.nextLine());
			payment.makePayment(cardHolder, cardNumber, amount);
		}

		case 3 -> {
			System.out.print("Enter Debit Card Number: ");
			String cardNumber = sc.nextLine();
			System.out.print("Enter Amount: ");
			double amount = Double.parseDouble(sc.nextLine());
			payment.makePayment(cardNumber, amount);
		}

		default -> System.out.println("Invalid Choice!");
		}
		sc.close();
	}
}

class Payment {

	private boolean validateAmount(double amount) {
		return amount > 0;
	}

	private boolean validateCardNumber(String cardNumber) {
		return cardNumber != null && cardNumber.length() == 16;
	}

	private String maskCardNumber(String cardNumber) {
		return "****_****_****_" + cardNumber.substring(12);
	}

	public void makePayment(double amount) {
		if (validateAmount(amount)) {
			System.out.println("Processing payment via Cash...");
			System.out.println("Amount Paid Rs: " + amount);
			System.out.println("Payment Successful!");
		} else {
			System.out.println("Error: Amount must be greater than zero.");
		}
	}

	public void makePayment(String cardHolder, String cardNumber, double amount) {
		if (validateAmount(amount) && validateCardNumber(cardNumber)) {
			System.out.println("Processing payment via Credit Card...");
			System.out.println("Card Holder: " + cardHolder);
			System.out.println("Card Number: " + maskCardNumber(cardNumber));
			System.out.println("Amount Paid Rs: " + amount);
			System.out.println("Payment Successful!");
		} else {
			System.out.println("Error: Invalid card number. It must be 16 digits.");
		}
	}

	public void makePayment(String cardNumber, double amount) {
		if (validateAmount(amount) && validateCardNumber(cardNumber)) {
			System.out.println("Processing payment via Debit Card...");
			System.out.println("Card Number: " + maskCardNumber(cardNumber));
			System.out.println("Amount Paid Rs: " + amount);
			System.out.println("Payment Successful!");
		} else {
			System.out.println("Error: Invalid card number. It must be 16 digits.");
		}
	}
}
