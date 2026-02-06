/*WAP to remove Negative Numbers from an Integer Array.

    Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
   
    Output : Positive Numbers: [5, 10, 15]
*/



package com.junaid.stream_lab;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveNegativeNumbers {
	void main() {

		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
		List<Integer> positive=Stream.of(numbers).filter(ele->ele>0).collect(Collectors.toList());
		positive.forEach(IO::println);
		
	}
}
