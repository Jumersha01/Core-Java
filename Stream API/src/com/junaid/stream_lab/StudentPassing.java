package com.junaid.stream_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

record Student(String name,Double score,String status) {
	
}
public class StudentPassing {
void main() {
	List<Student> students = new ArrayList<>(6);
	students.add(new Student("Scott",77D,"Pass"));
	students.add(new Student("Smith",80D,"Pass"));
	students.add(new Student("Alen",90D,"Pass"));
	students.add(new Student("Miller",60D,"Pass"));
	
	 List<String> name =students.stream().filter(st->st.score()>75).map(s->s.name()).collect(Collectors.toList());
     name.forEach(IO::println);
}
}
