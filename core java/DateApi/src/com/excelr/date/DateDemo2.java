package com.excelr.date;

import java.time.LocalDate;

public class DateDemo2 {

	public static void main(String[] args) {

	LocalDate dob=	LocalDate.of(1990, 11, 30);
	System.out.println("dob :"+ dob);
	
	System.out.println(dob.getDayOfMonth());
	
	}

}
