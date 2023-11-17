package com.excelr.day11.fileio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException  {

		PrintWriter pw = new PrintWriter("abc.txt");
		pw.print(100);
		pw.write(100);
		
		pw.flush();
		pw.close();
	}

}
