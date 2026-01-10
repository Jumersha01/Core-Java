package com.junaid.array_logicals;

import java.util.Arrays;

public class LeetCodePr01 {
void main() {
	int arr1[]= {1,2,3,0,0,0};
	int arr2[]= {2,5,6};
	int m =3;
	int n =3;
	merge(arr1,m,arr2,n);
}

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

       int count=0;
         for(int i =m-1;i>=0;i--){
        	 IO.println(i);
            nums1[n++]=nums2[count++]; 
             
         }
         for(int i =0;i<nums1.length;i++) {
        	    
        	     for(int k =i+1;k<nums1.length;k++) {
        	    	      if(nums1[i]>nums1[k]) {
        	    	    	      int temp = nums1[i];
        	    	    	      nums1[i]=nums1[k];
        	    	    	      nums1[k]=temp;
        	    	    	      
        	    	      }
        	     }
         }
     
        
            IO.println(Arrays.toString(nums1));
        
    }
}


