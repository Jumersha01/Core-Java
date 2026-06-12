package com.junaid.binary_stream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {

	public static void main(String[] args) throws IOException {
		String path = "D:\\FileSystem\\Object_file.txt";
		
		var fin = new FileInputStream(path);
		var ois=new ObjectInputStream(fin);
		try (fin;ois){
			 while(true) {
				Product pr= (Product) ois.readObject();
				System.out.println(pr);
			 }
		}
		catch(EOFException e) {
			//e.printStackTrace();
			System.out.println("End of file reached:");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
		
	}

}
