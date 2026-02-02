package com.junaid.map_interface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
 class Employee implements Comparator{
	 int id;
	 String name;
	 public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	 }
	 @Override
	 public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	 }
	 @Override
	 public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	 }
	 
	 
	
}
public class MapDemo01 {
void main() {
	Employee e1 = new Employee(111,"Junaid");
	Employee e2 = new Employee(222,"Mannan");
	Employee e3 = new Employee(333,"Pavan");
	Employee e4 = new Employee(444,"Arshad");
	
	Map<Employee,String> empData = new HashMap<>();
	empData.put(e1, "Hyd");
	empData.put(e2, "Jalgaon");
	empData.put(e3, "Temi");
	empData.put(e4, "Hyd");
	
//	empData.forEach((k,v)->IO.println( ));
//	Set<Employee> key = empData.keySet();
//	
//     IO.println(empData.isEmpty());
//     IO.println(empData.get(e1));
//     IO.println(empData.size());
//      IO.println(empData.getOrDefault(key, "Not found"));
//      empData.computeIfPresent(e2,(k,v)-> v="Singnur");
//      key.stream().sorted().
//     empData.clear();
//     IO.println(empData.isEmpty());
//	empData.entrySet().removeIf(entr->entr.getValue().equals("Hyd"));
//	 Set<Map.Entry<Employee, String>> entries = empData.entrySet();
//	
//	for(Map.Entry<Employee,String> entry:entries) {
//	 if(entry.getValue().equals("Hyd")) {
//	 }
//	 IO.println(entry.getKey()+""+entry.getValue());
//	}
//	
	
	Set<Map.Entry<Employee, String>> entries = empData.entrySet();
	Iterator<Map.Entry<Employee, String>> it = entries.iterator(); 
	
	for(Map.Entry<Employee, String> en : entries) {
		if(en.getKey().id==333) {
		it.remove();
		}
		IO.println(en.getKey()+""+en.getValue());
	}
     
	
	
}
}
