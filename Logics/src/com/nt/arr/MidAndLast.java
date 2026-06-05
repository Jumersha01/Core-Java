package com.nt.arr;

public class MidAndLast {

	public static void main(String[] args) {

		String str = "java is fantastic and awesome";
		System.out.println(upperCase(str));

	}

	public static String upperCase(String str) {

		String sarr[] = str.split(" ");
		
		String sr = "";

		for (int i = 0; i < sarr.length; i++) {

			char ch[] = sarr[i].toCharArray();

			for(int j =0;j<ch.length;j++) {
				
				int first = 0;

				int mid = sarr[i].length() / 2;

				int last = sarr[i].length() - 1;

				ch[first]=Character.toUpperCase(ch[first]);
				ch[mid]=Character.toUpperCase(ch[mid]);
				ch[last]=Character.toUpperCase(ch[last]);
				
				sr+=ch[j];
			}
			
			sr+=" ";

		}

		return sr;

	}

}
