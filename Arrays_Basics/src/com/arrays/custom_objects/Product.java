package com.arrays.custom_objects;

public class Product {
private int pId;
private String pName;
private double pPrice;

Product(int pId,String pName,double pPrice){
	this.pId = pId;
	this.pName = pName;
	this.pPrice = pPrice;
	
}
public  int getId() {
	return this.pId;
}
@Override
public String toString() {
	return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
}


}
