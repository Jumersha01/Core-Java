package com.arrays.day_4;

import java.util.*;
public class Equals {
	public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Size of an 1st Array");
	    int n1 = sc.nextInt();

	    int arr1[] = new int[n1];
	    for(int i = 0;i<n1;i++){
	     	System.out.println("Enter the First Array "+i+"th element");
	        arr1[i] = sc.nextInt();

	    }
	    System.out.println("Enter the Size of an 2nd Array");
	      
	      int n2  = sc.nextInt();
	    int arr2 []= new int[n2];
	     
	      for(int j = 0; j<n2;j++){
	    	  	System.out.println("Enter the Secong Array "+j+"th element");
	        arr2[j] = sc.nextInt();
	      }
	        boolean isValid =false;
	        for(int k =0;k<arr1.length;k++){
	             for(int l =0;l<arr2.length;l++){
	                if(arr1[k]==arr2[l]){
	                    isValid=true;
	                }
	                else{
	                    isValid=false;
	                }
	             }
	        }
	        if(isValid==true){
	      System.out.println("Equal");
	        }
	        else{
	           System.out.println("Not Equal"); 
	        }

	}
	}


