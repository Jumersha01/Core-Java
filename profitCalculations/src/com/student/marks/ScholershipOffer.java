package com.student.marks;

public class ScholershipOffer {
  public static Scholarship  getScholarship(Student s) {
	  double percentage = s.getPercentage();
	  String grade="";
	  if(percentage<70) {
		  grade="No Scholarship";
}
	  
	  else 	  if(percentage>70&&percentage<80) {
		  grade="Merit";
	  }
	  else 	  if(percentage>85&&percentage<94) {
		  grade="Excellent";
	  }
	  else {
		  grade="Distinction";
	  }
	
	  return new Scholarship(s,grade);
  }
}
