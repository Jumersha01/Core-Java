

package com.junaid.stream_lab;

import java.util.Arrays;
import java.util.List;

/*
 * WAP to print all the unique numbers from the Array.

    Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
    Output : Unique Numbers: [1, 2, 3, 4, 5, 6, 7, 8]

 */
public class PrintingUniquElements {
  void main() {
	  Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
	  List<Integer> listOfUnique= Arrays.stream(numbers).distinct().toList();
	  IO.println("Unique Numbers: "+listOfUnique);
	
  }
}
