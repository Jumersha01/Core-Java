package com.junaid.selfstudy;

class  Test{
	static int x =10;
}
public class ValueOfClassLevelVarible {
//static int a;
//static String s;
//static double d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		Test t2 = new Test();
		++t1.x; ++t2.x;
		System.out.println(t1.x);
		System.out.println(t2.x);
//	
//		System.out.println(a);
//		System.out.println(s);
//		System.out.println(d);

	}

}
