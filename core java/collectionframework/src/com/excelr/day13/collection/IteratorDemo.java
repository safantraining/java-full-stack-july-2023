package com.excelr.day13.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> basket1 = new ArrayList<Integer>();
		basket1.add(1);
		basket1.add(2);
		basket1.add(3);
		basket1.add(4);
		basket1.add(5);
		
		System.out.println("====using Iterator=====");
	Iterator<Integer> itr =	basket1.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("======using ListIterator====");
	
	System.out.println("---backward direction----");
      ListIterator<Integer> listItr =  	basket1.listIterator();
      while(listItr.hasPrevious())
      {
    	  System.out.println(listItr.previous());
      }
      
      System.out.println("---forward direction---");
       while (listItr.hasNext()) {
           System.out.println(listItr.next());		
	}
       
       System.out.println("---backward direction----");
       while(listItr.hasPrevious())
       {
     	  System.out.println(listItr.previous());
       }
       
      
	
	}

}
