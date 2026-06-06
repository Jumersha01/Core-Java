package com.junaid.simple_logicals;

public class ReverseOddNo {
  void main() {
	  int sum = 0;
	  int num = 123456789;
	  while(num!=0) {
		  
		  int last = num%10;
		  
		  if(last%2!=0) {
			sum =sum*10+last;  
		  }
		  
		  num=num/10;
	  }
	  IO.println(sum);
  }
}
