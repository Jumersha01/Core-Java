package com.junaid.vector_examples;

import java.util.Scanner;
import java.util.Vector;

public class Library {
	public void displayAvailableBooks(Vector<Book> books) {
		for (Book book : books) {
			IO.println(book);
		}
	}

	public void issueBook(Vector<Book> books, Scanner sc) {

		IO.print("Enter Book id which for Book issue :");
		int id = Integer.parseInt(sc.nextLine());

		boolean isBookAvail = false;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).id() == id) {
				isBookAvail = true;
				IO.println("Issued:" + books.get(i));
				books.remove(i);
				break;
			}

		}
		if (isBookAvail) {

		} else {
			IO.println("Book with ID " + id + " not Found");

		}

	}

	public void searchBook(Vector<Book> books, Scanner sc) {
		boolean bookFound = false;
		IO.println("Enter keyword to search by title or author:");
		String search = sc.nextLine();

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).author().equalsIgnoreCase(search) || books.get(i).title().equalsIgnoreCase(search) ) {
				IO.println(books.get(i));
				bookFound = true;
				break;
			}

		}
		if (bookFound) {

		} else {
			IO.println("Book not found");
		}

	}

}
