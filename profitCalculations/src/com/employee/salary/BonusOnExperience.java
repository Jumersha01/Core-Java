package com.employee.salary;

public class BonusOnExperience {
public static BonusType getBonusType(Employee e) {
	  int experiences = e.getExperience();
	  String bt;
	  if(experiences<3) {
		 bt="No Bonus"; 
	  }
	  else if(experiences>3&&experiences<5) {
			 bt="Bronze"; 
		  }
	  else if(experiences>5&&experiences<10) {
			 bt="Siver"; 
		  }
	  else {
		  bt = "Gold";
	  }
	  
	return new BonusType(e,bt);
}
}
