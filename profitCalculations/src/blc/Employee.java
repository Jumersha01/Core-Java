package blc;



public class Employee {
int employeeId ;
String employeeName;
double employeeSalary;
  public void setEmployeeDetails(int id,String name,double salary) {
	  employeeId=id;
	  employeeName=name;
	  employeeSalary=salary;
  }
  public void getEmployeeDetails() {
	  System.out.println("The id of the Employee is :"+employeeId);
	  System.out.println("The name of the Employee is :"+employeeName);
	  System.out.println("The salary of the Employee is :"+employeeSalary);  
	  
  }
}
