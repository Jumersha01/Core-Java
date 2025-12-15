package com.junaid.interfac;
@FunctionalInterface
interface Printer{
	void print();
}

class PrinterDemo{
	public Printer getPrinter() {
		 return  new Printer() {
			   public void print() {
				   IO.println("Printer is printing");
			   }
		   };
		  
}
}
public class InterfaceImplementationByUsingAnonymous {

	public static void main(String[] args) {
		PrinterDemo p = new PrinterDemo();
		Printer s= p.getPrinter();
	    s.print();

	}

}
