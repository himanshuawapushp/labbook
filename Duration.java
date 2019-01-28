package com.capg.lab33;

import java.time.LocalDate;
import java.time.Period;

public class Duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld= LocalDate.of(2014, 12, 12);
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		Period pd =Period.between(now, ld);
		System.out.println(pd);
			
	}

}
