package com.nt.arrays;

public class SortedInDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100, 90, 50, 20, 5};
		IO.print("Is DEScending:"+isDescending(arr));

	}
	public static boolean isDescending(int arr[]) {
		boolean isSorted = false;
		
		 for( int i = 0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				isSorted=true;
			}
			else {
				return false;
			}
			
	}
		 return  isSorted;

}
}
