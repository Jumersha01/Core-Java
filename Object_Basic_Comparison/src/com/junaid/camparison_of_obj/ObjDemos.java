package com.junaid.camparison_of_obj;

class Customer{
	int id;
	String name;
	Customer(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		
		int id1 = this.id;
		String name1 = this.name;
		
		Customer cust = (Customer) obj;
		int id2 = cust.id;
	String name2 = cust.name;
	if(id1==id2&&name1.equals(name2)) {
		return true;
	}
	else {
		return false;
	}
				
	}
}
public class ObjDemos {
void main() {
	
	
	Customer custome1 = new Customer(101,"Junaid");
	Customer custome2 = new Customer(103,"Junaid");
	
	IO.println(custome1.equals(custome2));
	
	
}
}
