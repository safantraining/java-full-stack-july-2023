package com.excelr.day11.fileio;

import java.io.File;
import java.io.IOException;

public class FolderDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("movies");
		file.mkdir();
		
		File f2 = new File("E:\\full stack 8.30 to 10.30\\eclipse workspace\\file handling\\movies\\hello.txt");
		f2.createNewFile();
		
	}

}
