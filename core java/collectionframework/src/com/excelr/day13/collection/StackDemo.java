package com.excelr.day13.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		
		Stack<Integer> stack = new Stack<>();
		stack.add(1);// jdk 1.2
		stack.push(2); // jdk 1.0
		stack.add(3);
		stack.push(4);
		
		System.out.println(stack);
		
	      System.out.println("prints the top element :"+stack.peek());
	      
	      System.out.println("remove and return the element :"+ stack.pop());
			System.out.println(stack);

	      System.out.println("remove and return the element :"+ stack.pop());
			System.out.println(stack);

	      System.out.println("remove and return the element :"+ stack.pop());
			System.out.println(stack);

	      System.out.println("remove and return the element :"+ stack.pop());
			System.out.println(stack);


		
	}

}
