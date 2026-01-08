package com.junaid.vector_examples;

import java.util.Scanner;
import java.util.Vector;

public class LibraryManagement {
void main() {
	Vector<Book> books = new Vector<>();
	books.add(new Book(101,"Core Java","Mr James"));
	books.add(new Book(102,"Adv Java","Mr Robert"));
	books.add(new Book(103,"Head First Java","Miss kathy Sierra"));
	books.add(new Book(104,"Programmig in c","Mr Dennis"));
	
	IO.println(" 1) Display Books Available in the Library \n"
			+ "	 2) Search a Book in the Library \n"
			+ "	 3) Issue a Book from the Library \n"
			+ "	 4) Exit from the application :");
	int choice = Integer.parseInt(IO.readln());
	Scanner sc = new Scanner(System.in);
Library lab = new Library();
	switch(choice) {
	case 1->	lab.displayAvailableBooks(books);
	case 2->lab.searchBook(books, sc);
	case 3->lab.issueBook(books, sc);
	case 4->{IO.println("Thank Your For Visiting");System.exit(0);}
	default->IO.println("Invalid Input:");
	}
}
}
