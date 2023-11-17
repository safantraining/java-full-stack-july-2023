package com.excelr.day11.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {

		
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc3.txt"));
		bw.write("sachin");
		bw.newLine();
		bw.write("rahul");
		bw.newLine();
		bw.write("kumar");
		
		bw.flush();
		bw.close();
	}

}
