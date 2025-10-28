package com.junaid.object_passing;

public class Sourcing {
private int sourceId;
private String sourceName;
private double basicSalary;
private double HRAPer;
private double DAPer;
private double  enrollmentTarget;
private int enrollmentReached;
private int perkPerEnrollment;


public Sourcing(int sourceId, String sourceName, double basicSalary, double hRAPer, double dAPer,
		double enrollmentTarget, int enrollmentReached, int perkPerEnrollment) {
	super();
	this.sourceId = sourceId;
	this.sourceName = sourceName;
	this.basicSalary = basicSalary;
	HRAPer = hRAPer;
	DAPer = dAPer;
	this.enrollmentTarget = enrollmentTarget;
	this.enrollmentReached = enrollmentReached;
	this.perkPerEnrollment = perkPerEnrollment;
}


public  double calculateGrossSalary() {
	return this.basicSalary +this.HRAPer +this.DAPer +(((this.enrollmentReached/this.enrollmentTarget)*100)*this.perkPerEnrollment);
}
}
