package com.junaid.object_passing;

public class Employee {
   private  int employeeId;
   private String employeeName;
   private double basicSalary;
   private double HRAPer;
   private double DAPer;
   
   
   Employee(int employeeId, String employeeName,double basicSalary,double HRAPer,double DAPer){
	   this.employeeId=employeeId;
	   this.employeeName=employeeName;
	   this.basicSalary=basicSalary;
	   this.HRAPer=HRAPer;
	   this.DAPer=DAPer;
   }
   
   public double  calculateGrossSalary() {
	   
	   return (this.basicSalary+this.HRAPer+this.DAPer);
   }
   
}
