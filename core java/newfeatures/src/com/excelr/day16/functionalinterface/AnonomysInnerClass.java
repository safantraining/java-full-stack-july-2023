package com.excelr.day16.functionalinterface;

public class AnonomysInnerClass {

	public static void main(String[] args) {

		//Parent parent = new Parent();
		//parent.breakfast();
		
		Parent parent2 = new Parent()
		{
			void breakfast()
			{
				System.out.println("poori");
			}
		};
		
		parent2.breakfast();
	}

}
