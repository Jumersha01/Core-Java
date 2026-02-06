package com.junaid.stream_lab;

import java.util.Arrays;

//WAP to convert all the names of String array into uppercase 
//
//String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
//
//Output : [VIRAT, SANJU, ROHIT, BUMRAH]


public class StringUpper {
void main() {
	String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
	Arrays.stream(names).map(name->name.toUpperCase()).forEach(IO::println);
}
}
