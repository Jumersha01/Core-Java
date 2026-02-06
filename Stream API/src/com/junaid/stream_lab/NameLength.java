package com.junaid.stream_lab;

import java.util.Arrays;
import java.util.List;

/*
 * WAP to print all the names from String array where the length of the 
    name must be greater than 3.

    String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
    Output : [Rohit, Smirti, Richa]
 */
public class NameLength {
void main() {
	 String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
	 List<String> list = Arrays.stream(words).filter(name->name.length()>3).toList();
	 IO.println(list);
	 
	   }
}
