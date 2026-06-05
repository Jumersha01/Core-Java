package com.junaid.lab_lemaining;

import java.util.*;
public class HospitalService {
	List<Hospital> hospitalDetails = null;
	public int  addHospital(String hospitalName,List<String> listOfTreatment,
			String contactPerson,String contactNumber,String location) {
		 hospitalDetails = new ArrayList();
		hospitalDetails.add(new Hospital( hospitalName, listOfTreatment,contactPerson, contactNumber,location));
		
		return hospitalDetails.get(1).getHospitalCode();
	}
	
	public Map<String,Integer> getHospitals(){
		
		
		return new HashMap<String,Integer> ();
	}
}
