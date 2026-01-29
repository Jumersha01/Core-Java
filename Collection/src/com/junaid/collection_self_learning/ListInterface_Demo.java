package com.junaid.collection_self_learning;

import java.util.ArrayList;
import java.util.List;

public class ListInterface_Demo {

	public static void main(String[] args) {
		List<Integer> numbers =new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		List <Integer> somePart = numbers.subList(1,5);
		somePart.forEach(System.out::println);
		
		}

}
