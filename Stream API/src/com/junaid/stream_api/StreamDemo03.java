package com.junaid.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo03 {
void main() {
	List<String> listOfNames = Arrays.asList("Junaid," ,"Aman", "Arshad", "Sonu","Mannan","Arshad","Akil","Arbaz");

	Set<String> setOfNames = listOfNames.stream().filter(names->names.startsWith("A")).collect(Collectors.toSet());
        setOfNames.forEach(IO::println);
}
}
