package com.junaid.stream_api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamDemo02 {
	void main() {
		   //Filter all even number from collection with Stream and without Stream Api
		
	   List<Integer> listOfNo  = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
	   
	   //without Stream Api
	   
	      List<Integer > even = new ArrayList();
	      
	      for(int i =0;i<listOfNo.size();i++) {
	    	     if(listOfNo.get(i)%2==0) {
	    	    	 even.add(listOfNo.get(i));
	    	     }
	      }
	      even.forEach(IO::println);
	      
	      //With Stream Api
	      IO.println("With Stram Api");
	        listOfNo.stream().filter(ele->ele%2==0).forEach(IO::println);
	      
	   
	} 
}
