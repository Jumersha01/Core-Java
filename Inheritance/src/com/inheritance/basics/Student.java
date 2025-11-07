package com.inheritance.basics;

import java.util.Scanner;

class StudentDetails{
	protected String studentName;
	protected int studentId;
	protected String studentAddress;
	
	public StudentDetails(String studentName, int studentId, String studentAddress) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAddress = studentAddress;
	}

	
	
	
	
	
}

class Science extends StudentDetails{
	
	private int phy;
	private int math;
	public Science(String studentName, int studentId, String studentAddress, int phy, int math) {
		super(studentName, studentId, studentAddress);
		this.phy = phy;
		this.math = math;
	}
	@Override
	public String toString() {
		return "Science [phy=" + phy + ", math=" + math + " name="+super.studentName+" addres="+super.studentAddress+" student id="+super.studentId+"]";
	}
	
	
	
}

public class Student {
     
	public static void main(String[] args) {
		//Taking the inputs of user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Student Name :");
		String name = sc.nextLine();
		
		System.out.print("Enter the Student id: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter the Student Address: ");
		String addres  = sc.nextLine();
		
		System.out.print("Enter the Student sub: ");
		int sub = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter the Student sub2: ");
		int sub2 = Integer.parseInt(sc.nextLine());
		
		
	    Science s = new Science(name,id,addres,sub,sub2);
	    System.out.println(s);

	}

}
