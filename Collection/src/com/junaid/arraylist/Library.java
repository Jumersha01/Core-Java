package com.junaid.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	ArrayList<Book> books;

	Library() {
		this.books = new ArrayList<>();
	}

	public void addBook(Book book) {

		for (int i = 0; i < this.books.size(); i++) {
			if (this.books.get(i).getIsbn() == book.getIsbn()) {
				IO.println("Book with the same ISBN ..... already exists.");
				break;
			}
			IO.println("Book Added SuccesFully");
			books.add(book);

		}

	}

	private Book searchBookByISBN(long isbn) {

		Book b = null;
		for (int i = 0; i < this.books.size(); i++) {
			if (this.books.get(i).getIsbn() == isbn) {
				b = books.get(i);
				break;

			}

		}
		return b;

	}

	public void displayAllBooks() {
		for (Book b : books) {
			IO.println(b.displayBook());
		}
	}

	public void updateBookQuantityByISBN(long isbn) {
		IO.println("Updating Quantity of the book:");
		int quantity = Integer.parseInt(IO.readln("Enter new Quantity: "));
		if (quantity <= 0) {
			IO.println("Quantity cant be zero or negative!");
			System.exit(0);
		} else {
			IO.println("Quantity updated successfully. new quantity=" + quantity);
			Book b = this.searchBookByISBN(isbn);
			b.setQuantity(quantity);
		}

	}

	public void deleteBookByTitle(String title) {
		if (title.isBlank() || title.isEmpty()) {
			IO.println("Title cant be empty/null:");
			System.exit(0);
		}
		Iterator<Book> it = books.iterator();
		while (it.hasNext()) {
			String t = it.next().getTitle();

			if (t.equals(title)) {
				it.remove();
			IO.println(title + " Book removed SuccuesFully");
			break;
			}
		}
	}
}