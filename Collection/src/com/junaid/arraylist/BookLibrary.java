package com.junaid.arraylist;

import java.util.ArrayList;

public class BookLibrary {
	void main() {

		Book b1 = new Book("Core Java", "James", 123456788765L, 1289.0, 10);
		Book b2 = new Book("Advance Java", "Scott", 887651234567L, 1689.0, 20);
		Library lab = new Library();
		lab.books.add(b1);
		lab.books.add(b2);

		while (true) {
			int choice = Integer.parseInt(IO.readln("1. Add Book\r\n" + "2. Display Books\r\n"
					+ "3. Update Quantity\r\n" + "4. Delete Book\r\n" + "5. Exit\n"));
			switch (choice) {
			case 1 -> {
				String title = IO.readln("Enter Title: ");
				String author = IO.readln("Enter Author: ");
				long isbn = Long.parseLong(IO.readln("Enter ISBN: "));
				double price = Double.parseDouble(IO.readln("Enter Price: "));
				int quantity = Integer.parseInt(IO.readln("Enter Quantity: "));
				lab.books.add(new Book(title, author, isbn, price, quantity));
			}
			case 2 -> {
				lab.displayAllBooks();
			}
			case 3 -> {
				long isbn = Long.parseLong(IO.readln("Enter ISBN: "));
				lab.updateBookQuantityByISBN(isbn);
			}
			case 4 -> {
				String title = IO.readln("Enter Title: ");
				lab.deleteBookByTitle(title);
			}
			case 5 -> {
				IO.println("Thank You Visit Again");
				System.exit(0);

			}
			}
		}
	}
}
