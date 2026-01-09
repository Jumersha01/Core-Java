package com.junaid.arraylist;

public class CabCustomerServiceTester {
void main() {
	CustomerService custService = new CustomerService();
   
	Customer c1 =new Customer(101,"Junaid","Hydrabad","Singanoor",740,"9021428504");
	Customer c2 =new Customer(102,"Sonu","Ameerpet","Kacheguda",40,"9021428504");
	Customer c3 =new Customer(103,"Arshad","Nallapalli","Nagpur",640,"8541778507");
	Customer c4=new Customer(104,"Pawan","Ameerpet","Kacheguda",3,"844144858");
	Customer c5= new  Customer(104,"Pawan","Ameerpet","Kacheguda",3,"844144858");
	custService.addCustomer(c1);
	custService.printBill(c3);
	
	
	
	
}
}
