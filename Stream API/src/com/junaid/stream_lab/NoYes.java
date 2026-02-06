package com.junaid.stream_lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//WAP to convert boolean value to "Yes" or "No"
//
//Boolean[] flags = {true, false, true, false, true};
//
//Yes/No Values: [Yes, No, Yes, No, Yes]

public class NoYes {
void main() {
	Boolean[] flags = {true, false, true, false, true};
	Stream arr=Arrays.stream(flags).map(ele->{
		if(ele==true) {
			return "Yes";
		}
		else {
			return "No";
		}
	});
	List<String> fl=arr.toList();
	IO.println(fl);
}
}
