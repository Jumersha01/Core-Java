package com.junaid.stream_api;

import java.util.List;
import java.util.stream.Stream;
record Employee(Integer id, String name, Double salary)
{
}
public class StreamDemo01 {
	void main() {
//		   String fruits[] = {"Mango","Apple","Grapes","Banana"};
//		   Stream<String> stream =Arrays.stream(fruits);
//		   stream.map(fruit->fruit.toUpperCase()).sorted().forEach(IO::println);
//		   
//		   
//		   int numbers [] = {1,2,4,5,6,7,8 };
//		   
//		IntStream intArray =  Arrays.stream(numbers).map(ele ->ele*2);
//		intArray.forEach(IO::println);   
//					IntStream k = Arrays.stream(numbers);
//					IntStream j = k.filter(f->f%2!=0);
//				
//					j.forEach(IO::println);
//		
//		
		   
		   
		

        List<Employee> employees = List.of(
            new Employee(1, "Amit", 25000.0),
            new Employee(2, "Rahul", 26000.0),
            new Employee(3, "Sneha", 27000.0),
            new Employee(4, "Priya", 28000.0),
            new Employee(5, "Karan", 29000.0),
            new Employee(6, "Neha", 30000.0),
            new Employee(7, "Rohit", 31000.0),
            new Employee(8, "Anita", 32000.0),
            new Employee(9, "Vikas", 33000.0),
            new Employee(10, "Pooja", 34000.0),

            new Employee(11, "Arjun", 35000.0),
            new Employee(12, "Meena", 36000.0),
            new Employee(13, "Suresh", 37000.0),
            new Employee(14, "Kavya", 38000.0),
            new Employee(15, "Manoj", 39000.0),
            new Employee(16, "Rina", 40000.0),
            new Employee(17, "Deepak", 41000.0),
            new Employee(18, "Nisha", 42000.0),
            new Employee(19, "Sunil", 43000.0),
            new Employee(20, "Asha", 44000.0),

            new Employee(21, "Mohit", 45000.0),
            new Employee(22, "Divya", 46000.0),
            new Employee(23, "Raj", 47000.0),
            new Employee(24, "Isha", 48000.0),
            new Employee(25, "Anil", 49000.0),
            new Employee(26, "Payal", 50000.0),
            new Employee(27, "Sanjay", 51000.0),
            new Employee(28, "Rekha", 52000.0),
            new Employee(29, "Nitin", 53000.0),
            new Employee(30, "Shalini", 54000.0)
        );
        
     
      
	}

}
