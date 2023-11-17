package day4;

import java.util.Scanner;

public class ArrayUserInputDemo {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter size of array");
		int size = scanner.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the element at "+ i + "index");
			arr[i]= scanner.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("element at "+ i +" index ="+arr[i]);
		}
		
		//smallest, largest , second largest, sum of element
		
	}
	


}
