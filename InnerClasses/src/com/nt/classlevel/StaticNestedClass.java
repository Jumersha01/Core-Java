package com.nt.classlevel;

class Employee {
	int id;
	String name;
	double salary;

	static String address;
	static class EmployeeAddress {


		EmployeeAddress(String address) {
	       Employee.address=address;
		}
		
		@Override
		public String toString() {
			return "Employee Address is: "+Employee.address;
		}
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class StaticNestedClass {
 void main() {
	 Employee emp = new Employee(101,"Junaid",45000);
	 Employee.EmployeeAddress empAddress = new Employee.EmployeeAddress("Hydrabad");
	  System.out.println(empAddress);
 }
}
