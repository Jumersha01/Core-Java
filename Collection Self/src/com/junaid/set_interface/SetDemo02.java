package com.junaid.set_interface;

import java.util.HashSet;
import java.util.Set;
record Employee(Integer id,String name) {
	
}

public class SetDemo02 {
 void main() {
	 Set<Object> mixData = new HashSet<>();
	 mixData.add(12);
	 mixData.add("Junaid");
	 mixData.add(false);
	 mixData.add(true);
	 mixData.add(null);
	 mixData.add(null);
	 mixData.add(34.6);
	 mixData.add(new Employee(1,"Ravi"));
	 
	 IO.println(mixData.size());
	 IO.println("*****************");
	 
	 Set<String> s = new HashSet<>();
	 s.add("Java");
	 s.add(new String("Java"));
	 IO.println(s.size());
	 IO.println(s.size());
	 
	 IO.println("*****************");
	 Set<StringBuilder> sb = new HashSet<>();
	 sb.add(new StringBuilder("Junaid"));
	 sb.add(new StringBuilder("Junaid"));
	 
	 IO.println(sb.size());//here the size is 2 SB hasnt followed the hashcode and equals method
	 
	 
	 
	 
 }
	
}
