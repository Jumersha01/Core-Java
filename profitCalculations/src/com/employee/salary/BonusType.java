package com.employee.salary;

public class BonusType {
private Employee employee;
private String  bonusCategory;
   BonusType(Employee em,String bonusCategory){
	  this.employee=em;
	  this.bonusCategory=bonusCategory;
   }
   @Override
   public String toString() {
	return "The Employee "+this.employee+" Is Eligible For "+this.bonusCategory+" Bonus";
   }
   
}
