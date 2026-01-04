package com.junaid.array_logicals;

public class EvenOdd {
void main()
{
	int arr []= {1,2,3,4,5,6,7,8,9,10};
	String isEven="";
	String isOdd="";
	for(int i =0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			isEven+=" "+arr[i];
		}
		else {
			isOdd+=" "+arr[i];
		}
	}
	IO.println("Even:"+isEven);
	IO.println("Odd:"+isOdd);
}
}
