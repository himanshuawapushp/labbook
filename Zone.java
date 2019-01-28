package com.capg.lab36;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Zone {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ZonedDateTime currentTime = ZonedDateTime.now();
		ZonedDateTime currentTimeParis= ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime currentTimeNewYork = currentTime.withZoneSameInstant(ZoneId.of("America/NewYork"));
		System.out.println("INDIA:"+ currentTime);
		System.out.println("Europe:"+ currentTimeParis);
		System.out.println("America:"+ currentTimeNewYork);
		
		
		
		
		

	}

}
