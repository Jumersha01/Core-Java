package com.nt.demo01;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class AnonyMouseInnerClassTest {
 
	void main() {
		  Predicate<Integer> p = e->e%2==0;
		 
		 // List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
//		  
//		  
//		  class FindEvenOdd{
//			
//			  public void getEvenOdd(List<Integer> list) {
//				  for(Integer l:list) {
//				    boolean isEven = p.test(l);
//				    String result= isEven? "Even NO is "+(l):"Odd NO is: "+(l);
//				    System.out.println(result);
//				  }
//			  }
//			
//		  }
//		  FindEvenOdd e = new  FindEvenOdd();
//		  e.getEvenOdd(list);
		  
		  String str="Applee";
		  
          Set<Character> seen = new HashSet<Character>();
          Set<Character> duplicate = new HashSet<Character>();
          
          for(int i =0;i<str.length();i++) {
        	      if(!seen.add(str.charAt(i))) {
        	    	       duplicate.add(str.charAt(i));
        	      }
          }
          duplicate.forEach(IO::println);
          
          
		  
		  
		  
	}
	
}
