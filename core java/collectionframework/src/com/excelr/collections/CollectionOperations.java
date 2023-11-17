package com.excelr.collections;

import java.util.ArrayList;

public class CollectionOperations {

	public static void main(String[] args) {

		ArrayList<String>  fruits = new ArrayList<String>();
		
		System.out.println("size before adding :"+ fruits.size());
		
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		
		System.out.println("size after adding:"+ fruits.size());
		System.out.println("elements :"+ fruits);
		
		fruits.add(1, "banana");
		System.out.println();
		
		System.out.println("size after adding:"+ fruits.size());
		System.out.println("elements after adding at 1st index:"+ fruits);
		System.out.println();

		
		fruits.set(2, "pineapple");
		System.out.println("elements after set[update] :"+ fruits);
		System.out.println();

		
		fruits.remove("kiwi");// index or element
		System.out.println("after remove kiwi :"+ fruits);
		System.out.println();
		
		System.out.println("serach the apple :"+ fruits.contains("apple"));
		System.out.println("serach the kiwi :"+ fruits.contains("kiwi"));
		System.out.println();

		System.out.println("index access :"+ fruits.get(1));
		
		fruits.clear();
		System.out.println("after clear :"+ fruits);
		
		

		

	}

}
