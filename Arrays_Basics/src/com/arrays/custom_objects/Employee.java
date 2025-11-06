package com.arrays.custom_objects;

public class Employee {
private int id;
private String name;
private double salary;

Employee(int id,String name,double salary){
	this.id =id;
	this.name=name;
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}



}
