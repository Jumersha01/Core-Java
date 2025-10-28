package com.junaid.object_passing;

public class Trainer {
private int trainerId;
private String trainerName;
private double basicSalary;
private double HRAPer;
private double DAPer;
private int batchCount;
private double perkPerBatch;



public Trainer(int trainerId, String trainerName, double basicSalary, double hRAPer, double dAPer, int batchCount,
		double perkPerBatch) {
	super();
	this.trainerId = trainerId;
	this.trainerName = trainerName;
	this.basicSalary = basicSalary;
	HRAPer = hRAPer;
	DAPer = dAPer;
	this.batchCount = batchCount;
	this.perkPerBatch = perkPerBatch;
}



public double calculateGrossSalary()
{
	return (this.basicSalary+this.HRAPer+this.DAPer+this.batchCount+this.perkPerBatch);
}
}
