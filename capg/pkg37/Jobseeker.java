package com.capg.pkg37;
import java.util.*;

public class Jobseeker {
	static Scanner sc = new Scanner(System.in);
	static String str = sc.nextLine();
	
	public static void check()
	{
		if(str.length()>11)
		{
			if((str.charAt(str.length()-4)=='_') && (str.charAt(str.length()-3)=='j') && (str.charAt(str.length()-2)=='o') && (str.charAt(str.length()-1 )=='b'))
			{
				System.out.println("true");
			}
		}
		else
		{
			System.out.println("false");
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		check();

	}

}
