package com.junaid.stream_api;

import java.util.Arrays;
import java.util.List;

//WAP to extract First Letter of Each Word from String Array
//
//String []names = {"James", "Aryan", "Vibha", "Aniket"};
//
//First Letters: [J, A, V, A]

public class ExtractWord {
  void main() {
	  String []names = {"James", "Aryan", "Vibha", "Aniket"};
	  List<Character> ar=Arrays.stream(names).map(name->name.charAt(0)).toList();
	  IO.println(ar);
  }
}
