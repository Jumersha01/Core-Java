package com.junaid.simple_logicals;

public class ReversNO {
void main() {
	int arr = 1234567890;
	String rev = "";
	
	while(arr!=0) {
		int last = arr%10;
		rev+=last;
		arr=arr/10;
	}
	//IO.println(rev);
	int n = Integer.parseInt(rev);
	System.out.println(n);
}
}
