package com.excelr.day11.fileio;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("abc2.txt");
		
		if(file.exists())
		{
			System.out.println("file is already present");

		}
		else
		{
			System.out.println("file not present, creating a new file");
			file.createNewFile();
			System.out.println("file is created..");
			
		}
		
		
	}

}
