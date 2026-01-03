package com.junaid.collection_basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomerComparator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IO.println("Enter the size of the customer Array:");

		int size = Integer.parseInt(sc.nextLine());

		Customer customer[] = new Customer[size];

		IO.println("Enter the data for the Customer Array");
		for (int i = 0; i < size; i++) {
			IO.println("Enter Data for the " + (i + 1) + "st Customer:");

			IO.println("Enter id for the " + (i + 1) + "st Customer:");
			int id = Integer.parseInt(sc.nextLine());

			IO.println("Enter name for the " + (i + 1) + "st Customer:");
			String name = sc.nextLine();

			IO.println("Enter bill of the " + (i + 1) + "st Customer:");
			int bill = Integer.parseInt(sc.nextLine());


			customer[i] = new Customer(id, name, bill);

		}
		
		IO.println("Sorting by using Customer name: ");
		Comparator<Customer> cmp = (m1,m2)->m1.name().compareTo(m2.name());
		
		Arrays.sort(customer, cmp);
		for(Customer m:customer) {
			IO.println(m);
		}
		
		IO.println("Sorting by using Customer id: ");
		cmp = ((m1,m2)->m1.id()-m2.id());
		
		Arrays.sort(customer, cmp);
		for(Customer m:customer) {
			IO.println(m);
		}
		
		
		IO.println("Sorting by using Customer bill: ");
		cmp = ((m1,m2)->m1.bill()-m2.bill());
		Arrays.sort(customer, cmp);
		for(Customer m:customer) {
			IO.println(m);
		}

	}

}
