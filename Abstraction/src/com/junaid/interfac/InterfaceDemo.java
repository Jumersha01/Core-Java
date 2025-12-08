package com.junaid.interfac;


interface Alpha{
	void run();
}
interface Beta{
	void run();
}
class Implementor implements Alpha,Beta{
	public void run() {
		System.out.println("Multiple inheritace is possible in interface");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		new Implementor().run();

	}

}
