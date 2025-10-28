package com.junaid.object_passing;

public class Manager {
private int managerId;
private String managerName;
private double basicSalary;
private double HRAPer;
private double DAPer;
private double projectAllowance;



public Manager(int managerId, String managerName, double basicSalary, double hRAPer, double dAPer,
		double projectAllowance) {
	super();
	this.managerId = managerId;
	this.managerName = managerName;
	this.basicSalary = basicSalary;
	HRAPer = hRAPer;
	DAPer = dAPer;
	this.projectAllowance = projectAllowance;
}



public double calculateGrossSalary()
{
	return (this.basicSalary+this.HRAPer+this.DAPer+this.projectAllowance);
}
}
