package com.arrays.basics_problems;

import java.util.*;
public class DeleteElement {

	  public static void main(String [] args){
		  
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of an array:");
	   int n = sc .nextInt();
	   if(n<=0){
	     System.out.println("Invalid array size");
	     System.exit(0);
	   }
	   int arr [] = new int[n];
	   for(int i =0;i<n;i++){
	    arr[i] = sc.nextInt();
	   }
	   System.out.println("Enter the element:");
	   int element = sc.nextInt();
	   System.out.println("Before: "+Arrays.toString(arr));
	   deleteElements(arr,element);

	  }
	  public static void deleteElements(int arr [], int element){
	     
	     int found = 0;
	     for(int i = 0;i<arr.length;i++){
	      if(arr[i]==element){
	        found++;

	      }

	     }
	     if(found ==0){
	      System.out.println("Element not found");
	      System.exit(0);
	     }
	     int arr2[] = new int[arr.length-found];
	     int ind=0;
	     for(int i=0;i<arr.length;i++)
	     {
	        if(arr[i]!=element)
	        {
	          arr2[ind++]=arr[i];
	        }
	     }
	  System.out.print("After: ");
	  System.out.print(Arrays.toString(arr2));
	  }
	}


