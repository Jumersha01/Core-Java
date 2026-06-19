package com.nt.demo01;

import java.util.List;
import java.util.function.Predicate;

public class AnonyMouseInnerClassTest {
 
	void main() {
		  Predicate<Integer> p = e->e%2==0;
		  IO.println(p.test(10));
		  List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		  
		  
		  class FindEvenOdd{
			
			  public void getEvenOdd(List<Integer> list) {
				  for(Integer l:list) {
				    boolean isEven = p.test(l);
				    String result= isEven? "Even NO is "+(l):"Odd NO is: "+(l);
				    System.out.println(result);
				  }
			  }
			
		  }
		  FindEvenOdd e = new  FindEvenOdd();
		  e.getEvenOdd(list);
		  
		  
	}
	
}
