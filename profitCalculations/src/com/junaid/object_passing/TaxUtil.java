package com.junaid.object_passing;

public class TaxUtil {
public static double  calculateTax(Employee e) {
	 if(e.calculateGrossSalary()>50000) {
		return e.calculateGrossSalary()-(0.20*e.calculateGrossSalary());
	}
	 else {
		 return e.calculateGrossSalary()-(0.05*e.calculateGrossSalary());
	 }
}
public  static double  calculateTax(Manager m) {
	if(m.calculateGrossSalary()>50000) {
		return m.calculateGrossSalary()-(0.20*m.calculateGrossSalary());
	}
	 else {
		 return m.calculateGrossSalary()-(0.05*m.calculateGrossSalary());
	 }
}
public static  double  calculateTax(Trainer t) {
	if(t.calculateGrossSalary()>50000) {
		return t.calculateGrossSalary()-(0.20*t.calculateGrossSalary());
	}
	 else {
		 return t.calculateGrossSalary()-(0.05*t.calculateGrossSalary());
	 }
}
public  static double  calculateTax(Sourcing s) {
	if(s.calculateGrossSalary()>50000) {
		return s.calculateGrossSalary()-(0.20*s.calculateGrossSalary());
	}
	 else {
		return  s.calculateGrossSalary()-(0.05*s.calculateGrossSalary());
	 }
}


}
