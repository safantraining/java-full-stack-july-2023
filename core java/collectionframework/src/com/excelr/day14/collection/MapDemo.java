package com.excelr.day14.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		

		// insertion order
		LinkedHashMap<String, String> hm = new LinkedHashMap<>();
		hm.put("sachin", "batsman");
		hm.put("bumrah", "bowler");
		hm.put("dhoni", "wicketkeeper");
		hm.put("rahul", "batsman");
		hm.put("dhoni", "captain");

		System.out.println(hm);
		
		//sorted order
		TreeMap<String, String> tm = new TreeMap<String,String>();
		tm.put("sachin", "batsman");
		tm.put("bumrah", "bowler");
		tm.put("dhoni", "wicketkeeper");
		tm.put("rahul", "batsman");
		tm.put("dhoni", "captain");

		System.out.println(tm);
	}

}
