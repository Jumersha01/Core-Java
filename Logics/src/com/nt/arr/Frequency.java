package com.nt.arr;

public class Frequency {

	public static void main(String[] args) {
		
		String arr ="apple";
		char str[] =arr.toCharArray();
		
		for(int i=0;i<str.length;i++) {
			int count =1;
			
			for(int j =i+1;j<str.length;j++) {
				  
				if(str[i]==str[j]&&str[j]!='*') {
					count++;
					str[j]='*';
				}
				
			}
			
			if(str[i]!='*') {
				System.out.println(str[i]+" : "+count);
			}
			
		}
		
	}
	
}
