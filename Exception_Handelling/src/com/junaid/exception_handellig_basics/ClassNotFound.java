/*
 * 
 * Assignment 01 :
================

Handling ClassNotFoundException in Java

Objective:
Develop a Java application that demonstrates the use of Java Reflection and exception handling. 
The program should prompt the user to enter the fully qualified name of a class and attempt to dynamically load the class using Class.forName(). 
If the class does not exist, the application must handle the resulting ClassNotFoundException gracefully.

Instructions:
-------------

-> Create a class named ClassNotFoundExpDemo:

-> Implement a constructor that takes a String parameter representing the class name.
   Access Modifier : public
   parameter : String

-> Inside the constructor, declare a variable of type Class<?>.
   Use a try block to attempt to load the class using Class.forName(className).
   Catch ClassNotFoundException and print an appropriate message along with the stack trace.

-> Create a main method:
   Inside the main method, create a Scanner object to read input from the user.
   Prompt the user to enter a class name.
   Read the user's input and pass it to the ClassNotFoundExpDemo constructor.
   Close the Scanner object.


TEST CASE 1 :
-------------
Input:
Enter the class name to load: java.lang.String

Output:
Class loaded successfully: java.lang.String


TEST CASE 2 :
--------------
Input:
Enter the class name to load: com.nareshit.Faculty

Output:
Error: Class 'com.nareshit.Faculty' not found.
java.lang.ClassNotFoundException: com.nareshit.Faculty
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:375)
	at com.testing.ClassNotFoundExpDemo.<init>(ClassNotFoundExpDemo.java:10)
	at com.testing.ClassNotFoundExpDemo.main(ClassNotFja
 */



package com.junaid.exception_handellig_basics;

public class ClassNotFound {
   String className;
public	ClassNotFound(String className){
	Class<?> cls;
		this.className=className;
		try {
			cls=Class.forName(this.className);
			IO.println("Class Loaded SuccusFully");
		}
		catch(ClassNotFoundException e) {
			IO.print("Error: Class '"+this.className+"' not Found \n");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String className = IO.readln("Enter the class Name:");
		
		new ClassNotFound(className);
	}

}
