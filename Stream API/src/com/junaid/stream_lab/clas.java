//Given a list of Person objects with name and age properties, write a program to sort the list of persons by age in ascending order using the Stream API.

package com.junaid.stream_lab;

import java.util.ArrayList;
import java.util.List;

record Person(String name ,Integer age) {
	
}
public class clas {
  void main() {
	   List<Person> listOfPerson = new ArrayList<> ();
	     listOfPerson.add(new Person("Junaid",23));
	     listOfPerson.add(new Person("Sonu",25));
	     listOfPerson.add(new Person("Arshad",22));
	     listOfPerson.stream().sorted((p1,p2)->p1.age().compareTo(p2.age())).forEach(IO::println);
	     
	     
			   }
}
