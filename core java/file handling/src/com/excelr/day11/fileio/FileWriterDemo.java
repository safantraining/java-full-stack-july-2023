package com.excelr.day11.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("demo.txt", true);
		fw.write("hello \n");
		fw.write("welcome\n");
		fw.write("\n");
		//fw.write(98);
		//fw.write(77);
	
		fw.flush();
		fw.close();
		
		
	}

}
