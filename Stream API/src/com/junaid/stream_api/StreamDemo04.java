package com.junaid.stream_api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Employee(Integer id,String name,Double salary) {
	
}

public class StreamDemo04 {
void main() {
	//Fetch all employee name whose salary is greater than 50k and convert in list Object
	 Employee e1= new Employee(101,"Junaid",90000D);
	 Employee e2= new Employee(102,"Arshad",85000D);
	 Employee e3= new Employee(103,"Sonu",50000D);
	 Employee e4= new Employee(104,"Mannan",80000D);
	 Employee e5= new Employee(105,"Arbaz",4000D);
	 Employee e6= new Employee(106,"Aman",30000D);
	 
	  Stream.of(e1,e2,e3,e4,e5,e6).filter(emp->emp.salary()>50000).collect(Collectors.toList()).forEach(emp->IO.println(emp.name()));
	 
	 
	
}
}
