package com.excelr.day13.collection;

import java.util.ArrayList;

public class IterateCollectionDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> basket1 = new ArrayList<Integer>();
		basket1.add(1);
		basket1.add(2);
		basket1.add(3);
		basket1.add(4);
		basket1.add(5);
		
		System.out.println("elements :"+basket1);
		
		for(int num : basket1)
			System.out.println(num);

	}

}
