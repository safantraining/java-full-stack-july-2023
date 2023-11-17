package com.excelr.day8.polymorphism;

interface BreakFast
{
	void prepare();
}

class Maggi implements BreakFast
{
     @Override
	public void prepare() {
		System.out.println(" steam for 5 mts");
		System.out.println("eat in hot");
	}
     
     void display()
     {
    	 System.out.println("this is is display");
     }
	
}

class Idly implements BreakFast
{
    @Override
	public void prepare() {
		System.out.println(" mix for water and grind for 10 hrs");
		System.out.println("steam for 10 mts");
	}
	
}



public class LooselyCoupled {

	public static void main(String[] args) {

		BreakFast breakFast = new Maggi();
		breakFast.prepare();
		
		
	}

}
