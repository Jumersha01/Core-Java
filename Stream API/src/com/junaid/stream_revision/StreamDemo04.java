package com.junaid.stream_revision;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo04 {
  void main() {
	  IntStream intStream = IntStream.of(1,2,3,4,5,6,7,8,9,10);
	  Stream<Integer> boxed = intStream.boxed();
	  
	    boxed.forEach(ele->{
	     Predicate pr = e->e instanceof Integer;
	       if(pr.test(ele))
	    	       System.out.println(ele+" is Integer");
	    });
  }
}
