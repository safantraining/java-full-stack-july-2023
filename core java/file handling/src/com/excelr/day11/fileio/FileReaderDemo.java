package com.excelr.day11.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("abc.txt");
		int read=0;
		
          read =  fr.read();
         System.out.println(read +" "+ (char)read);
         
         read = fr.read();
         System.out.println(read +" "+ (char)read);
         
         read = fr.read();
         System.out.println(read +" "+ (char)read);
         
         read = fr.read();
         System.out.println(read +" "+ (char)read);
		
		
	}

}
