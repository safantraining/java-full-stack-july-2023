package com.excelr.collections;

import java.util.ArrayList;

public class CollectionMethods2 {

	public static void main(String[] args) {

		ArrayList<Integer> basket1 = new ArrayList<Integer>();
		basket1.add(1);
		basket1.add(2);
		basket1.add(3);
		basket1.add(4);
		basket1.add(5);
		
		System.out.println("basket 1:"+ basket1);
		
		ArrayList<Integer> basket2 = new ArrayList<Integer>();
		basket2.add(4);
		basket2.add(5);
		basket2.add(6);
		basket2.add(7);
		basket2.add(8);
		
		System.out.println("basket 2:"+ basket2);
		
		//basket2.addAll(basket1);
		//System.out.println("after adding basket1 ,basket 2 =:"+ basket2);
		
		//basket2.removeAll(basket1);
		//System.out.println("after remove basket1 ,basket 2 =:"+ basket2);
		
		basket2.retainAll(basket1);
		System.out.println("after retain :"+ basket2);
		
	}

}
