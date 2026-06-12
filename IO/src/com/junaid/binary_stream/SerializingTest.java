package com.junaid.binary_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializingTest {
  void main() throws FileNotFoundException {
	  Scanner sc =  new Scanner(System.in);
	  
	  String path="D:\\FileSystem\\Object_file.txt";
	   
	  System.out.println("How many product do you want:");
	  Integer size  = Integer.parseInt(sc.nextLine());
	  var fout =  new FileOutputStream(path);
	  try(sc;fout;){
	  Product product[] = new Product[size];
	  var oout = new ObjectOutputStream(fout);
	   for(int i =0;i<size;i++) {
		   
		   System.out.println("Enter Proudct Id: ");
		   Integer id = Integer.parseInt(sc.nextLine());
		   
		   String name = IO.readln("Enter Product name: ");
		   
		   Double price = Double.parseDouble(IO.readln("Enter Product price: "));
		   
		   product[i]=new Product(id,name,price);	   
		   
	   }
	   
	   for(Product pr:product) {
		   oout.writeObject(pr);
	   }
	   System.out.println("Object Stored succes fully");
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  
  }
}
