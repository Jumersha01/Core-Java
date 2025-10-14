package elc;
import java.util.Scanner;

import blc.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the  id of the Student :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter the  name of the Student :");
		String name = sc.nextLine();
		
		System.out.print("Enter the  makrs of the Student :");
		int marks = Integer.parseInt(sc.nextLine());
		
		s1.setStudentData(id, name, marks);
		s1.calculateGrade(marks);
		System.out.println(s1.displayDetails());
		
		System.out.println("-------------------------------------");
		Student s2 = new Student();
	
		
		System.out.print("Enter the  id of the Student :");
		int id2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter the  name of the Student :");
		String name2 = sc.nextLine();
		
		System.out.print("Enter the  makrs of the Student :");
		int marks2 = Integer.parseInt(sc.nextLine());
		
		s2.setStudentData(id2, name2, marks2);
		s2.calculateGrade(marks);
		System.out.println(s2.displayDetails());
		
		

	}

}
