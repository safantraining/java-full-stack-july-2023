package com.excelr.day5;


class Test
{
	int a=1;  // global
	
	
	void disp1()
	{
		int a = 100; // local
		System.out.println("value of a "+this.a + " value of a "+ a);
	}
	
	void disp2()
	{
		int a=200;  // local
		System.out.println("value of a "+ this.a + " value of a "+ a);

	}
}





public class VariableDemo {

	public static void main(String[] args) {

		Test test = new Test();
		test.disp1();
		test.disp2();
		test.a=56;   // instance / global
	}

}
