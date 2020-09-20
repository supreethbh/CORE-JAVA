package com.dxc.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeAndDateDemo {

	public static void main(String[] args) {
		
		LocalDate current = LocalDate.now();
		System.out.println("Current Date : " + current);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date & Time : " + currentDateTime);
		
		LocalDate gotoDate = LocalDate.of(1997, Month.AUGUST, 10);
		System.out.println("Date of Expected : " + gotoDate);
		
		System.out.println("Next Day   : " + current.plusDays(1));
		System.out.println("Next Month : " + current.plusMonths(1));
		System.out.println("Next Year  : " + current.plusYears(1));
		
		LocalDate start = LocalDate.of(1997, Month.AUGUST, 10);
		LocalDate end = LocalDate.now();
		
		Period period = start.until(end);
		
		System.out.println("Day   : " + period.get(ChronoUnit.DAYS));
		System.out.println("Month : " + period.get(ChronoUnit.MONTHS));
		System.out.println("Year  : " + period.get(ChronoUnit.YEARS));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String text = "10/08/1997";
		LocalDate date = LocalDate.parse(text, formatter);
		
		System.out.println("Formatted Date : " + date);
		
		Date date1 = Date.from(start.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		System.out.println("Date : " + date1);
	}
}
