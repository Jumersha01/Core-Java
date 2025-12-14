package com.junaid.predifined_functional_interface;

import java.util.function.Consumer;

public class ConsumerDemo {
 void main() {
	 Consumer<String> names = name->IO.println("The name of the Student is: "+name);
String name  = IO.readln("Enter the name: ");
	 names.accept(name);
 }
}
