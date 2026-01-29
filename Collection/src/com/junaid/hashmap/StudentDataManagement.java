package com.junaid.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDataManagement {
	void main() {
		Map<String, Integer> students = new HashMap();

		IO.println("------ Student Management Menu ------\r\n" + "1. Add Student\r\n" + "2. Update Marks\r\n"
				+ "3. Delete Student\r\n" + "4. Search Student\r\n" + "5. Display All Students\r\n"
				+ "6. Show Topper\r\n" + "7. Show Lowest Scorer\r\n" + "8. Show Total and Average Marks\r\n"
				+ "9. Exit\r\n" + "Enter your choice:");
		Scanner sc = new Scanner(System.in);
		int choice = Integer.parseInt(sc.nextLine());
		while (true) {
			switch (choice) {
			case 1 -> {
				IO.println("Enter Student Name: ");
				String name = sc.nextLine();
				IO.println("Enter Student Marks: ");
				int marks = Integer.parseInt(sc.nextLine());
				students.put(name, marks);
			}
			case 2 -> {
				IO.println("Enter Student Name to update the marks: ");
				String name = sc.nextLine();
				int marks = Integer.parseInt(sc.nextLine());
				boolean isAvail = false;
				for (Map.Entry<String, Integer> entry : students.entrySet()) {
					if (entry.getKey().equals(name)) {
						entry.setValue(marks);
						isAvail = true;
					}

				}
				if (isAvail) {
					IO.println("Updated SuccesFully");
				} else {
					IO.println("Name not Found" + name);
				}

			}
			case 3 -> {
				IO.println("Enter Student Name to Delete: ");
				String name = sc.nextLine();

				boolean isAvail = false;
				for (Map.Entry<String, Integer> entry : students.entrySet()) {
					if (entry.getKey().equals(name)) {
						students.remove(name);
						isAvail = true;
					}

				}
				if (isAvail) {
					IO.println("Deleted Succussfulyy");

				} else {
					IO.println("Name not Found" + name);
				}

			}
			case 4 -> {
				IO.println("Enter Student Name to Search ");
				String name = sc.nextLine();

				boolean isAvail = false;
				for (Map.Entry<String, Integer> entry : students.entrySet()) {
					if (entry.getKey().equals(name)) {

						isAvail = true;
					}

				}
				if (isAvail) {
					IO.println("" + name + "Scored " + students);

				} else {
					IO.println("Name not Found" + name);
				}
			}
			}
		}

	}
}
