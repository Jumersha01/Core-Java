package com.junaid.stream_lab;

import java.util.Arrays;

public class NamesContainsA {
void main() {
	/*
	 * WAP to print all the names from String array which contains 
    letter 'a' in the name.

    String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
    Output : Names Containing 'A' or 'a' : [Rahul, Raj, Arnav]
    
	 */
 String[] names1 = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
  Object[] strings = Arrays.stream(names1).filter(name->(name.contains("a")||name.contains("A"))).toArray();
 
 IO.println("Names conataining  'A' "+Arrays.toString(strings));
 	
}
}
