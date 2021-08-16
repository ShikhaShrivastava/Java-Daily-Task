package com.techment.Day11_LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalDateTime datetime= LocalDateTime.now();
		System.out.println(datetime);
		
		LocalDate birthDate=LocalDate.of(1997, 8, 29);
		System.out.println(birthDate);
		
		System.out.println(date.isAfter(birthDate));
				
	}

}
