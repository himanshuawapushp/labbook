package com.capg.lab32;
import java.util.*;


public class Posstring {
	static Scanner sc= new Scanner(System.in);
	static String str= sc.nextLine();
	public static void pos()
	{
		int i,f=0;
		char a,b;
		for(i=0;i<str.length()-1;i++)
		{
			a=str.charAt(i);
			b=str.charAt(i+1);
			if(a>b)
			{
				f=1;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		pos();
		

	}

}
