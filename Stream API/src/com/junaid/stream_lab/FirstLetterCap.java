//write a program to convert all the lower case strings in a list to first letter Uppercase and print the result using the Stream API.
package com.junaid.stream_lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstLetterCap {
  void main() {
	  List<String> lower = Arrays.asList( "abcd" , "efgh" , "jklm" , "xyz");
	 lower.stream().map(e->e.substring(0, 1).toUpperCase()+e.substring(1)).forEach(IO::println);
	
	
  }
}
