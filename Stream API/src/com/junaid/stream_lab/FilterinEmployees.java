
//Given a list of Employee objects with id and salary properties, write a program to filter the list of Employees by salary in who are having salary > 30000.

package com.junaid.stream_lab;

import java.util.Arrays;
import java.util.List;

record Employ(Integer id,Double salary) {
	
}
public class FilterinEmployees {
void main() {
	List<Employ> listOfEmployee = Arrays.asList(new Employ(101,40000d),new Employ(102,80000d),new Employ(103,80000d),new Employ(103,1000d),new Employ(104,3500d),new Employ(105,60000d));
	listOfEmployee.stream().filter(emp->emp.salary()>35000).forEach(IO::println);
}
}
