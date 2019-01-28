package com.capg.lab34;

import java.time.*;

public class Duration2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LocalDate ld1= LocalDate.of(2011 ,12 ,12);
		LocalDate ld2= LocalDate.of(2019, 01, 26);
		Period pd = Period.between(ld2,   ld1);
		System.out.println(" "+ pd +"  " );
		
		

	}

}
