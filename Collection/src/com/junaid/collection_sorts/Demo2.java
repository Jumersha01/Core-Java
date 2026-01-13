package com.junaid.collection_sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

record Product(Integer id,String name)  {
	
}
public class Demo2 {
void main() {
	Product p11= new Product(102,"Laptop");
	Product p12 = new Product(104,"Mobile");
	Product p13= new Product(103,"Camera");
	Product p14 = new Product(101,"Tv");
	
	List<Product> productList = new ArrayList<>();
	productList.add(p11);
	productList.add(p12);
	productList.add(p13);
	productList.add(p14);
	
	
	Comparator<Product> cmp =(p1,p2)->{
		return p1.id()-p2.id();
	};
	
	Collections.sort(productList,cmp);
	
	productList.forEach(System.out::println);
}
}
