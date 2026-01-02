package com.junaid.collection_basics;

public record Customer(int id,String name, int bill) implements Comparable<Object>
{

	
	public int compareTo(Object o) {
		
		return 0;
	}

}
