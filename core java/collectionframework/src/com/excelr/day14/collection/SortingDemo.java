package com.excelr.day14.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(58);
		marks.add(97);
		marks.add(80);
		marks.add(74);
		
		
		ArrayList<String> names = new ArrayList<>();
		names.add("ramesh");
		names.add("sourab");
		names.add("ankit");
		names.add("kumar");
		
		System.out.println("marks :"+ marks);
		System.out.println("names :"+ names);
		
		
		
		
		Collections.sort(marks);
		System.out.println("after sorting marks :"+ marks);
		
		Collections.sort(names);
		System.out.println("after sorting names :"+ names);
		
		
		//Collections.reverse(marks);
		//System.out.println("descending marks :"+ marks);
		
		//Collections.reverse(names);
		//System.out.println("descending names :"+ names);
		
		System.out.println("min :"+Collections.min(marks));
		System.out.println("max :"+Collections.max(marks));
		
		System.out.println(Collections.binarySearch(marks, 80));

		
		
		


		
		
		
		
	}

}
