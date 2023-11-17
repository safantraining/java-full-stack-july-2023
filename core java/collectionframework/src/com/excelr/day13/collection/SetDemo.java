package com.excelr.day13.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<String> fruits = new HashSet<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("apple");
		
		System.out.println("hashset own order:"+fruits);
		
		LinkedHashSet<String> f2 = new LinkedHashSet<>();
		f2.add("mango");
		f2.add("apple");
		f2.add("banana");
		f2.add("mango");
		f2.add("apple");
		
		System.out.println("linkedhashset insertion order:"+f2);
		
		TreeSet<String> f3 = new TreeSet<String>();
		f3.add("mango");
		f3.add("apple");
		f3.add("banana");
		f3.add("mango");
		f3.add("apple");
		
		System.out.println("treeset sorted order :"+ f3);
		
	}

}
