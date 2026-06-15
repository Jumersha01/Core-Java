package com.junaid.stream_revision;

import java.util.Arrays;
import java.util.List;

public class DoubleStreamDemo01{
	 void main() {
//		 List<Integer> list = List.of(10,20,30,40,50,60,70);
//		 
//		 list.stream()
//		 .mapToDouble(n->n)
//		                   .forEach(IO::println);
		 
		 int arr[] = {1,2,3,4,5,6,7,8,9,10};
		 
		 List<Integer> list = Arrays.stream(arr).boxed().toList();
		 
		 for(Integer ele:list) {
			 System.out.println(ele=null);
			 if(ele==0) {
				System.out.println(ele);
			 }
		 }
	 }
}