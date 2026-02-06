package com.junaid.stream_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;

public class InfinitStream {
 void main() {
	 int no = 5;
	    Stream.iterate(1,(e)->e+1).filter(n->n%2!=0).map(n->n*n).limit(10).forEach(IO::println);
	  }
  
}
