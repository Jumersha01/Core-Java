package com.junaid.stream_lab;

import java.util.Arrays;
import java.util.List;

//Write a program to convert all the strings in a list to uppercase and print the result using the Stream API.
public class StringInUpperCase {
void main() {
	List<String> listOfNames = Arrays.asList("Junaid","sonu","arshad","arbaz");
	
	listOfNames.stream().map(names->names.toUpperCase()).forEach(IO::println);
	
}
}
