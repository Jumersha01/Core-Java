package com.junaid.collection_sorts;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;


record Student (Integer id ,String name) implements Comparable<Object>{
	@Override
	public int compareTo( Object obj) {
		Student obj1 = (Student)obj;
		return this.id()-obj1.id();
	}

	
}

public class Demo1 {
	void main() {
Student s1 = new Student(101,"Junaid");
Student s2 = new Student(102,"Mannan");
Student s3 = new Student(103,"Arbaz");
Student s4 = new Student(104,"Shanawaz");

List<Student> studentsList = new Vector<>();
studentsList.add(s2);
studentsList.add(s1);
studentsList.add(s4);
studentsList.add(s3);


IO.println("Befor Sorting");
for(Student student: studentsList) {
	  IO.println(student);
}
IO.println("After Sorting");

Collections.sort(studentsList);
  for(Student student: studentsList) {
	  IO.println(student);
  }
  IO.println("By using steam");
  
  studentsList.forEach(System.out::println);

	}
	
}
