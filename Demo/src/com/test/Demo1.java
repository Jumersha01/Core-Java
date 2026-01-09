package com.test;

import java.util.*;
class Person 
{
    String name;
    int age;

    Person(String name, int age) 
    {
        this.name = name.equals(name);
        this.age = age;
    }

 }
class Demo1
{
public static void main(String args[])
{
	ArrayList<Person> v1 = new ArrayList<>();
     ArrayList<Person> a1 = new ArrayList<>();

     v1.add(new Person("Alice", 30));
     a1.add(new Person("Alice", 30));

     System.out.println(v1.equals(a1));
     System.out.println(v1.hashCode());
     System.out.println(a1.hashCode());
	 }
	 }

