package com.employee.salary;

public class TestEmployee {

	public TestEmployee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Employee e1 =new Employee("Junaid",18);
		System.out.println(e1.getExperience());
		 BonusType bonus = BonusOnExperience.getBonusType(e1);

	        System.out.println(bonus);
		
		
	}

}
