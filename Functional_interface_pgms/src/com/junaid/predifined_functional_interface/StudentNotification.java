/**?
 * Assignment 02
-------------
Develop a scenario based program by using Functional interface to provide the notification to the student on successful registration on a particular course.

Coding Requirement :
---------------------
Take a record Student
Components :
id : Integer
name : String
course : String

Take an ELC class StudentNotification with main method where :

Create a Consumer<Student> to write a welcome notification message.[see the Test cases for more details]

Take IO class for taking the input i.e. number of students [see Test Cases], Inside the loop take Student object and with the help of Consumer<T>, register the student in 
a particular course using notification message.

Test Cases :
------------
Test Case 01 :
--------------
Enter number of students: 3

Enter details for Student 1:
Enter ID: 101
Enter Name: Ravishankar
Enter Course: Java
Hello Ravishankar! Welcome to the Java course.

Enter details for Student 2:
Enter ID: 102
Enter Name: Rohan
Enter Course: Advanced Java
Hello Rohan! Welcome to the Advanced Java course.

Enter details for Student 3:
Enter ID: 103
Enter Name: Elina
Enter Course: Spring Boot
Hello Elina! Welcome to the Spring Boot course.

 */

package com.junaid.predifined_functional_interface;

import java.util.function.Consumer;

public class StudentNotification {

	public static void main(String[] args) {
		Consumer<Student11> studentNotifications = student -> IO
				.println("Hellow " + student.name() + "! Welcome to the " + student.course() + " Course");

		int noOfStudents = Integer.parseInt(IO.readln("Enter the number of students: "));

		for (int i = 0; i < noOfStudents; i++) {
			IO.println("Enter Details for " + (i + 1) + " Student:");
			int id = Integer.parseInt(IO.readln("Enter ID: "));
			String name = IO.readln("Enter Name: ");
			String course = IO.readln("Enter Course: ");

			Student11 stud1 = new Student11(id, name, course);
			studentNotifications.accept(stud1);
			IO.println();
		}

	}

}
