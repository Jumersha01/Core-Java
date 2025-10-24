package com.student.marks;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Junaid",85.9);
		Scholarship p1 = ScholershipOffer.getScholarship(s1);
		System.out.println(p1);

	}

}
