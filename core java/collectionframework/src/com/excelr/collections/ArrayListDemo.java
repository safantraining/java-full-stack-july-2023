package com.excelr.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList obj = new ArrayList();
		
		System.out.println("no.of elements present before adding :"+obj.size());
		
		obj.add("apple");
		obj.add(100);
		obj.add('c');
		obj.add(true);
		
		
		System.out.println("no.of elements present after adding :"+obj.size());

		System.out.println("elements are :"+ obj);
		
	}

}
