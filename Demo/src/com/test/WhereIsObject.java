package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class WhereIsObject {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Junaid");
		list.add("Sahil");
		list.add("Vinti");

		ListIterator<String> li = list.listIterator();

		while (li.hasNext()) {

			String s = li.next();
			li.add("Hellow");
			//System.out.println(s);
		}
		

		
          list.forEach(IO::println);

	}

}
