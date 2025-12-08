package com.junaid.interfac;


interface Drawable{
	void draw();
}
interface Colourable extends Drawable{
	void colour();
}
class Drawing implements Colourable{
	public void draw() {
		System.out.println("Drawing the Image");
	}
	public void colour() {
		System.out.println("Colouring the Imlage");
	}
}

public class ExtendingInterfaceDemo {

	public static void main(String[] args) {
	Colourable d = 	new Drawing();
	d.draw();
	d.colour();

	}

}
