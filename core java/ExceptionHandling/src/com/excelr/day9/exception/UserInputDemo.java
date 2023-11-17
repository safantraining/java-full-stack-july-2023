package com.excelr.day9.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		
		try
		{
			System.out.println("enter the value of a");
			int a = scanner.nextInt();
			
			System.out.println("enter the value of b");
			int b = scanner.nextInt();
			
			int result= a/b;
			System.out.println("result "+ result);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("do not enter zero");
		}
		catch (InputMismatchException e) {
			System.out.println("enter only number");
		}
		
		
		
		
	}

}
