package com.junaid.stream_lab;

import java.util.Arrays;

/*
 * WAP to print all the Prime Numbers from an Integer Array.

    Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    Output : Prime Numbers: [2, 3, 5, 7, 11]
 * */
 
public class PrimeNumbers {
void main() {
	 Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	 
	 Arrays.stream(numbers)
	 .filter(ele->
	 {
		 boolean isPrime= false;
		 int count =0;
		 for(int i = 1;i<=ele;i++) {
			 
			  if(ele%i ==0) {
				  count++;
			  }
			  
		 }
		 if(count==2) {
			 isPrime = true;
		 }
		 return isPrime;
	 }
			 ).forEach(IO::println);
}
}
