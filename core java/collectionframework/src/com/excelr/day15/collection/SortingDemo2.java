package com.excelr.day15.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(58);
		marks.add(97);
		marks.add(80);
		marks.add(74);
		
		System.out.println("before sorting");
        System.out.println(marks);
		Collections.sort(marks);
		System.out.println("after sorting");
		System.out.println(marks);
		
		
		
		
	}

}
