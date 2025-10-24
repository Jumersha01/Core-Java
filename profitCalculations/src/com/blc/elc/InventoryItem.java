package com.blc.elc;

import java.util.Scanner;

class Inventory{
	private String itemName;
	private double pricePerUnit;
	private int quantityInStock;
	
	Inventory(String itemName,double pricePerUnit, int quantityInStock){
		this.itemName=itemName;
		this.pricePerUnit=pricePerUnit;
		this.quantityInStock=quantityInStock;
		
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}
	

	
	public double calculateTotalValue() {
		
		return this.pricePerUnit*this.quantityInStock;
	}
}

public class InventoryItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Item Name:");
		String itemName = sc.nextLine();
		
		System.out.print("Enter Price Per Unit: ");
		double pricePerUnit= Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter Quantity In Stock: ");
		int quantityInStock =Integer.parseInt(sc.nextLine());
		
		Inventory v1 = new Inventory(itemName,pricePerUnit,quantityInStock);
		
		
		System.out.println("\n Inventory Item Details:");
		System.out.println("Item Name: "+v1.getItemName());
		System.out.println("Price Per Unit: "+v1.getPricePerUnit());	
		System.out.println("Quantity in Stock: "+v1.getQuantityInStock());
		System.out.println("Total Inventory Value: "+v1.calculateTotalValue());
		
		while(true) {
	    System.out.print("Any updation in Stock Price OR Quantity :");
	    String choice  = sc.nextLine().toUpperCase();
	    
	    
	    	if(choice.equalsIgnoreCase("yes")) {
		    	System.out.print("Enter New Price Per Unit :");
		    	double updatedPerUnit = Double.parseDouble(sc.nextLine());
		    	v1.setPricePerUnit(updatedPerUnit);
		    	System.out.print("Enter New Quantity In Stock:");
		    	int newQuantity = Integer.parseInt(sc.nextLine());
		    	v1.setQuantityInStock(newQuantity);
		    	
		    	System.out.println("\n Upadated Inventory Item Details :");
		    	System.out.println("Inventory Item Details:");
				System.out.println("Item Name: "+v1.getItemName());
				System.out.println("Price Per Unit: "+v1.getPricePerUnit());	
				System.out.println("Quantity in Stock: "+v1.getQuantityInStock());
				System.out.println("Total Inventory Value: "+v1.calculateTotalValue());
		    	
		    }
		    else {
		    	System.out.println("No Updation");
		    	sc.close();
		    	System.exit(0);
		    }
	    }
	     
	    

	}

}
