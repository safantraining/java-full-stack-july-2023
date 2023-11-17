package com.excelr.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDifferenceDemo {

	public static void main(String[] args) {
		


		LocalDate today = LocalDate.now();
		
		LocalDate dob = LocalDate.parse("1990-11-30");
		
	 Period p =  Period.between(dob, today);
	 System.out.println(p.getYears() +" years "+ p.getMonths() +" months"+ p.getDays()+" days");
	}

}
