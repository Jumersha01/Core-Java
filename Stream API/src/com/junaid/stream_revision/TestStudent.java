package com.junaid.stream_revision;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
  void main() {
	  
     Student s1  = new Student(101,"Junaid",90D); 
     Student s2  = new Student(104,"Sabir",80D); 
     Student s3  = new Student(105,"Sahil",95D);  
     Student s4  = new Student(103,"Arshad",91D); 
     Student s5  = new Student(102,"Sonu",70D); 
     Student s6  = new Student(106,"Arbaz",50D); 
     
     List<Student> list = new ArrayList<>();
     
     list.add(s1);
     list.add(s2);
     list.add(s3);
     list.add(s4);
     list.add(s5);
     list.add(s6);
     
     System.out.println("Unsorted List Of Students...");
     list.stream().forEach(IO::println);
     
     System.out.println("Sorted List of Student Based on Id...");
     list.stream().sorted((ss1,ss2)->ss1.id().compareTo(ss2.id())).forEach(IO::println);
     
     System.out.println("Sorted List of Student Based on Name...");
     list.stream().sorted((ss1,ss2)->ss1.name().compareTo(ss2.name())).forEach(IO::println);
     
     System.out.println("Sorted List of Student Based on Marks...");
     list.stream().sorted((ss1,ss2)->ss1.marks().compareTo(ss2.marks())).forEach(IO::println);
     
     
     
     
  }
}
