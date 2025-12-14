package com.junaid.predifined_functional_interface;

import java.util.function.Supplier;

record Student(Integer id,String name,double Marks) {
	
}
public class SupplierDemo {
	void main() {
  Supplier<Student> student = ()-> {
	  int id = Integer.parseInt(IO.readln("Enter the Student Id : "));
	  String name = IO.readln("Enter student name : ");
	  double marks = Double.parseDouble(IO.readln("Enter the student marks "));
	  return new Student(id,name,marks);
  };
  
  Student data = student.get();
  IO.println(data);
	}
  
	
}
