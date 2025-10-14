package elc;
import java.util.Scanner;

import blc.EmployeeProject;

public class TestEmployeeProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         EmployeeProject e1 = new EmployeeProject();
         Scanner sc = new Scanner (System.in);
         
         System.out.print("Enter the first name of the Employee : ");
         String first = sc.nextLine();
         
         System.out.print("Enter the last name of the Employee : ");
         String last = sc.nextLine();
         
         System.out.print("Enter the id of the Employee : ");
         int id = Integer.parseInt(sc.nextLine());
         
         System.out.print("Enter the salary of the Employee : ");
         double salary = Double.parseDouble(sc.nextLine());
         
         System.out.print("Enter the project of the Employee : ");
         int project = Integer.parseInt(sc.nextLine());
         
         e1.setEmployeeData(first, last, id, salary, project);
         e1.calculateSalary();
         e1.displayDetails();
	}

}
