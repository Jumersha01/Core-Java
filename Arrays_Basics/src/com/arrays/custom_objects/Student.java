package com.arrays.custom_objects;

public class Student {
private int id;
private String name;
private double marks;

Student(int id,String name,double marks){
	this.id= id;
	this.name=name;
	this.marks = marks;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}

}
