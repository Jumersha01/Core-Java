package com.junaid.set_interface;
import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
  void main() {
	  Set<Integer> numbers = new HashSet<>();
	  int n = Integer.parseInt(IO.readln("Enter how many elemets do you want:"));
	  
	  for(int i =0;i<n;i++) {
		  numbers.add(Integer.parseInt(IO.readln("Enter "+(i+1)+" elemets  you want:")));
	  }
	  numbers.forEach(System.out::println);
	  
	  
  }
}
