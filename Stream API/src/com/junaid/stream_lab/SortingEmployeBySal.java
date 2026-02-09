
//3. Given a list of Employee objects with id and salary properties, write a program to sort the list of Employees by salary in descending order using the Stream API.
package com.junaid.stream_lab;

import java.util.Arrays;
import java.util.List;

record Employees(Integer id,Double salary){
	
}
public class SortingEmployeBySal {
    
	void main() {
		List<Employees> listOfEmployee = Arrays.asList(new Employees(101,40000d),new Employees(102,80000d),new Employees(103,80000d),new Employees(103,1000d),new Employees(104,3500d),new Employees(105,60000d));
		
		   listOfEmployee.stream().sorted((e1,e2)->e2.salary().compareTo(e1.salary())).forEach(IO::println);
			
	}
}
