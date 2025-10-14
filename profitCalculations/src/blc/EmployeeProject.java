package blc;

public class EmployeeProject {
String firstName;
String lastName;
int employeeId;
double salary;
int noOfProjects;

public void setEmployeeData(String name,String lastNam,int id,double sal,int pro) {
	firstName = name;
	lastName = lastNam;
	employeeId = id;
	salary = sal;
	noOfProjects = pro;
	
}
public void calculateSalary() {
	
	switch(noOfProjects) {
	case 6,7,8,9->{salary+=5000;}
	case 10,11,12,13,14,15,16,17,18,19,20->{salary+=10000;}
	case 21,22,23,24,25,26,27,28,29,30->{salary+=15000;}
	default ->salary+=0;
	}
}
public void displayDetails() {
	System.out.println("The first name of the employee is : "+firstName);
	System.out.println("The last name of the employee is : "+lastName);
	System.out.println("The id of the employee is : "+employeeId);
	System.out.println("The salary of the employee is : "+salary);
	System.out.println("The number of project of the employee is : "+noOfProjects);
	
}

}
