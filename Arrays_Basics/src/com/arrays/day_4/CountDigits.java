package com.arrays.day_4;
import java.util.*;
public class CountDigits {

	
	
	    public static void main(String [] args){
	    	
	        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the Array:");
	        int n = sc.nextInt();
	        
	        int arr [] = new int[n];
	        for(int i =0;i<n;i++){
	        	System.out.println("Enter the "+i+"th element");
	            arr[i] = sc.nextInt();
	        }
	         for(int j = 0;j<arr.length;j++){
	            int count =0;
	            int temp = arr[j];
	            while(temp!=0){
	                temp/=10;
	                count++;

	            }
	            System.out.println("Number: "+arr[j]+", Digits: "+count);
	          
	         }
	         
	    }
	}

