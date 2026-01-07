package com.junaid.binary_stream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class WrittingData {
	void main() throws IOException {
		String path = "D:\\JavaFiles\\First.txt";
		var fout = new FileOutputStream(path);

		try (fout) {
			String data = "This is the first file i created in the java";
			byte []info = data.getBytes();
			
			fout.write(info);
			IO.println("File Written ");
		} catch (FileNotFoundException e) {
			IO.println(e);
		} catch (IOException e) {
			IO.println(e);
		}
	}
}
