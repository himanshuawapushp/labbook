package com.capg.pkg32;
import java.util.*;

public class Alpha {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the string");
		 String s = sc.nextLine();
		 s=s.toUpperCase();
		 check(s);
		 

	}
	 public static void check(String s)
	 {
		 int i,f=0;
		 char a,b;
		 for(i=0;i<s.length()-1;i++)
		 {
			 a=s.charAt(i);
			 b=s.charAt(i+1);
			 if(a>b)
			 {
				 f=1;
				 break;
			 }
		 }
		 if (f==0)
		 {
			 System.out.println("String is true");
			 
		 }
		 else
		 {
			 System.out.println("String is false");
		 }
	 }

}
