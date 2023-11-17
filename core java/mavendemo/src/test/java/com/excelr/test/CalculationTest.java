package com.excelr.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.excelr.Calculation;

public class CalculationTest {

	Calculation calculation = new Calculation();
	
	@Test
	public void test() 
	{
		assertEquals(4, calculation.add(2, 3));
	     
	}

}
