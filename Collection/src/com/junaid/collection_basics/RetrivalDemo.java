package com.junaid.collection_basics;

import java.util.Enumeration;
import java.util.Vector;

public class RetrivalDemo {

	public static void main(String[] args) {
		Vector<String> listOfName = new Vector<>();
		
		listOfName.add("Junaid");
		listOfName.add("Mannan");
		listOfName.add("Arshad");
		listOfName.add("Sonu");
		
		Enumeration<String> elements = listOfName.elements();
	  while(elements.hasMoreElements()) {
		  IO.println(elements.nextElement());
	  }

	}

}
