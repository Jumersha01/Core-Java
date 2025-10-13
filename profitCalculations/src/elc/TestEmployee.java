package elc;
import java.util.Scanner;

import blc.Employee;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee m1 = new Employee();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the id of the Employee");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the name of the Employee");
		String name =sc.nextLine();
		
		System.out.println("Enter the salary of the Employee");
		double salary = Double.parseDouble(sc.nextLine());
		
		m1.setEmployeeDetails(id, name, salary);
        m1.getEmployeeDetails();		
	}

}
