package com.excelr.date;

import java.time.LocalDate;

public class DateMethods {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		
		System.out.println("today"+ date);
		
	 System.out.println("adding 3 days :"+date.plusDays(3));
	 System.out.println("adding 2 yeards :"+date.plusYears(2));

	 System.out.println("subtract 2 days :"+date.minusDays(2));
	 System.out.println("substract 1 month :"+date.minusMonths(1));


	}

}
