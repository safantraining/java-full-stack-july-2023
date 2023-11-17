package com.excelr.date;

import java.time.LocalDate;

public class DateDemo {

	public static void main(String[] args) {

	LocalDate date=	LocalDate.now();
	System.out.println("today :"+ date);
	
	System.out.println("year :"+date.getYear());
	System.out.println("month :"+ date.getMonthValue());
	System.out.println("day :"+ date.getDayOfMonth());
	
	
	
	}

}
