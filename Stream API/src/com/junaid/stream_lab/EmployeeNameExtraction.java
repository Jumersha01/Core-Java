package com.junaid.stream_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Employee(Integer id,String name,Double Salary) {
	
}
public class EmployeeNameExtraction {
void main() {
	List<Employee> listOfEmployees = new ArrayList<>();
     listOfEmployees.add(new Employee(101,"Miller",45000d));
     listOfEmployees.add(new Employee(102,"Scott",55000d));
     listOfEmployees.add(new Employee(103,"Smith",60000d));
     listOfEmployees.add(new Employee(104,"Raj",70000d));
     
    // listOfEmployees.stream().sorted(null)
     
   List<String> names= listOfEmployees.stream().filter(emp->emp.Salary()>50000).map(emp->emp.name().toUpperCase()).collect(Collectors.toList());
   names.forEach(IO::println);
}
}
