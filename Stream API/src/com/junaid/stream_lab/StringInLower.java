//Write a program to convert all the strings in a list to lowercase and print the result using the Stream API.
package com.junaid.stream_lab;

import java.util.Arrays;
import java.util.List;

public class StringInLower {
void main() {
	List<String> listOfNames = Arrays.asList("JUNAID","SONU","ARSHAD","ARBAZ");
	listOfNames.stream().map(names->names.toLowerCase()).forEach(IO::println);
}
}
