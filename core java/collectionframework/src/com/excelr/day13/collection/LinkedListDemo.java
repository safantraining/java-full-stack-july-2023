package com.excelr.day13.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("apple");
		fruits.add("mango");
		fruits.addFirst("banana");
		fruits.addLast("kiwi");
		fruits.add("grapes");
		fruits.add(2, "hello");
		
		System.out.println(fruits);
		
		fruits.remove("mango");
		
		
	}

}
