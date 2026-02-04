package com.junaid.stream_api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Employ(Integer id,String name,Double salary) {
	
}

public class StreamDemo04 {
void main() {
	//Fetch all employee name whose salary is greater than 50k and convert in list Object
	 Employ e1= new Employ(101,"Junaid",90000D);
	 Employ e2= new Employ(102,"Arshad",85000D);
	 Employ e3= new Employ(103,"Sonu",50000D);
	 Employ e4= new Employ(104,"Mannan",80000D);
	 Employ e5= new Employ(105,"Arbaz",4000D);
	 Employ e6= new Employ(106,"Aman",30000D);
	 
	  Stream.of(e1,e2,e3,e4,e5,e6).filter(emp->emp.salary()>50000).collect(Collectors.toList()).forEach(emp->IO.println(emp.name()));
	 
	 
	
}
}
