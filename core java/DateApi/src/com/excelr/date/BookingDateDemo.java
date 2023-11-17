package com.excelr.date;

import java.time.LocalDate;
import java.util.Scanner;

public class BookingDateDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your booking date in yyyy-mm-dd format");
		
		String userinputdate = scanner.next();
		LocalDate bookingDate = LocalDate.parse(userinputdate);
		
		LocalDate today = LocalDate.now();
		
		
		if(bookingDate.isAfter(today))
		{
			System.out.println("valid booking date");
		}
		else
		{
			System.out.println("invalid booking date");
		}
	}

}
