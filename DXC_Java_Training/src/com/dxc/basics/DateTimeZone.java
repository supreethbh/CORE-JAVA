package com.dxc.basics;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeZone {

	public static void main(String[] args) {
		
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		System.out.println("Date & Time : " + zoneDateTime);
		
		System.out.println("India : " + ZonedDateTime.now(ZoneId.of("Asia/Calcutta")));
	}
}
