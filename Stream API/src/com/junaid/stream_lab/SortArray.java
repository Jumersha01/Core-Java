package com.junaid.stream_lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortArray {
void main() {
   int arr[] = {1,2,3,4,5,6,7};
  
   List<Integer> arr2 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	arr2.forEach(IO::println);
   
   
 
}
}
