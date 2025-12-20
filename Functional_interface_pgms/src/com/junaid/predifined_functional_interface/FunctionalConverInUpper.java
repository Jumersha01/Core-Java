package com.junaid.predifined_functional_interface;

import java.util.function.Function;

public class FunctionalConverInUpper {
void main()
{
	String sentence = IO.readln("Enter the Sentence / Word :");
	
	Function<String ,String> convertInUpperCase = str-> str.toUpperCase();
	IO.readln(convertInUpperCase.apply(sentence));
	
}
}
