package com.arrays.day_4;

import java.util.*;
public class LeaderElements {
	
	    public static void main(String [] args){
	        Scanner sc  = new Scanner(System.in);
	        System.out.println("Enter the Size of an Array");
	        int n = sc.nextInt();

	        int arr [] = new int[n];
	         
	               for(int i =0;i<n;i++){
	            	  	System.out.println("Enter the "+i+"th element");
	                 arr[i] = sc.nextInt();
	               }
	            
	            System.out.print("Leader elements are: ");
	            int max=0;
	            for(int j =0;j<arr.length;j++){
	                max=arr[j];
	                int last=arr[arr.length-1];
	                for(int k=j+1;k<arr.length;k++){
	                    if(arr[j]<arr[k]){
	                      max=arr[k];
	                    }
	                }
	                    System.out.print(max+" ");
	                    if(max==last)
	                    break;

	            }
	}
	}


