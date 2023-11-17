package com.excelr.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DobCalculator {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your dob in yyyy-mm-dd format");
		
		String userinputdate = scanner.next();
		LocalDate dob = LocalDate.parse(userinputdate);
		
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(dob, today);
		
		System.out.println("your age is ");
		System.out.println("year :"+ p.getYears());
		System.out.println("months :"+ p.getMonths());
		System.out.println("days :"+ p.getDays());
		
		
		
	}
}
