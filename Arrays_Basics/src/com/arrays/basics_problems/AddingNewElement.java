package com.arrays.basics_problems;

import java.util.*;
public class AddingNewElement {

	    public static void main(String []args){
	          
	          Scanner sc  = new Scanner (System.in);
	          System.out.println("Enter the size of an array");

	          int n  = sc.nextInt();
	          if(n<=0){
	            System.out.println("Invalid array size");
	            System.exit(0);
	          }
	 int arr[]= new int[n];
	          for(int i =0;i<n;i++){
	            arr[i] =sc.nextInt();
	          }
System.out.println("Enter the new Element");
	          int addNew = sc.nextInt();
	         System.out.println("Before: "+Arrays.toString(arr));

	         System.out.print("After: ");addNewElement(arr,addNew);
	    }
	    public static void addNewElement(int arr[],int adds){
	        int arr2 []= new int[arr.length+1];
	 
	        for(int i =0;i<arr.length;i++){
	            arr2[i]=arr[i];
	        }
	        arr2[arr2.length-1]=adds;
	        System.out.println(Arrays.toString(arr2));
	    }
	}

