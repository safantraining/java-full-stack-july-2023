package com.excelr.day14.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {

		// any map implementation,
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "sachin");
		hm.put(2, "ankit");
		hm.put(1, "rahul");
		hm.put(4, "kumar");
		hm.put(6, "mahesh");
		
		System.out.println("----print values----");
		System.out.println(hm.values());
		
		System.out.println("---print keys----");
		System.out.println(hm.keySet());
		
		System.out.println("---print key and value---");
		System.out.println(hm.entrySet());
		
		System.out.println("----iterate values----");
		for(String value : hm.values())
			System.out.println(value);
		
		
		System.out.println("---iterate keys----");
		for(int key : hm.keySet())
			System.out.println(key);
		
		System.out.println("---getting the value from key----");
		for(int key : hm.keySet())
			System.out.println("key ="+key +" value ="+ hm.get(key));
		
		
		
		System.out.println("---iterate using entry set---");
		for(Map.Entry<Integer,String> h : hm.entrySet())
			System.out.println(h);
		
	}

}
