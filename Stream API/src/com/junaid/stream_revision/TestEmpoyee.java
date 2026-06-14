package com.junaid.stream_revision;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	Integer id;
	String name;
	double salary;
	String address;
	String job;

	public Employee(Integer id, String name, double salary, String address, String job) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Employe name is: " + this.name + " Employee id: " + this.id + " Employee Salary : " + this.salary
				+ " Employee address: " + this.address + " Employee job: " + this.job;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

	public String getJob() {
		return job;
	}
	

}

public class TestEmpoyee {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee em1 = new Employee(101, "Junaid", 50000, "Hydrabad", "Developer");
		Employee em2 = new Employee(102, "Sheela", 45000, "Hydrabad", "QA Tester");
		Employee em3 = new Employee(105, "Junaid", 33000, "Banglore", "DBMS");
		Employee em4 = new Employee(103, "Sabir", 60000, "Pardi", "Developer");
		Employee em5 = new Employee(104, "Mannan", 400000, "Jalgoan", "Manager");

		list.add(em1);
		list.add(em2);
		list.add(em3);
		list.add(em4);
		list.add(em5);

//		for (Employee emp : list) {
//			System.out.println(emp);
//			System.out.println("_______________");
//		}
//		list.sort((e1, e2) -> e1.id.compareTo(e2.id));
//		list.stream().forEach(System.out::println);
		
		  Predicate<Integer> p= (n->n%2==0);
		  Predicate<Employee> e =(em->em.getSalary()>=50000);
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
//		
//		Set<Integer> s=numbers.stream().filter(ele->p.test(ele)).collect(Collectors.toSet());
//		s.forEach(IO::println);
		
		list.stream().filter(em->e.test(em)).forEach(IO::println);
		

	}

}
