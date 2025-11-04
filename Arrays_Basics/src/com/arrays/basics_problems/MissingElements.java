package com.arrays.basics_problems;

import java.util.*;
public class MissingElements {


	    public static void main(String [] args){
	        Scanner sc  = new Scanner(System.in);
	        System.out.println("Enter the size of an Element: ");
	        int n =sc.nextInt();
	        if(n<=0){
	            System.out.println("Invalid Array Size");
	            System.exit(0);
	        }
	int arr []= new int[n];
	        for(int i = 0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        for(int j = 0 ;j<arr.length;j++){
	            int temp =0;
	             for(int k = j+1;k<arr.length;k++){
	                if(arr[j]>arr[k]){
	                  temp = arr[j];
	                  arr[j]=arr[k];
	                  arr[k]=temp;
	                }
	             }
	        }
	            
	         for( int i = 0;i<arr.length-1;i++){
	            for(int k = arr[i]+1;k<arr[i+1];k++)
	            {
	                System.out.print(k+" ");
	            }
	         }
	        }
	    }


