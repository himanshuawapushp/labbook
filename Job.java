package com.capg.lab37;
import java.util.*;

public class Job {
	static Scanner sc= new Scanner(System.in);
	static String str = sc.nextLine();
	 public static void checkstring()
	 {
		 int flag=0;
		
		 if(str.length()>=12)
		 {
			 for(int i=0;i<str.length();i++)
			 {
			
				 if((str.charAt(i)=='_')&&(str.charAt(i+1)=='j')&&(str.charAt(i+2)=='o')&&(str.charAt(i+3)=='b'))
				 {
					 flag=1;
				 }
			 }
			 if(flag==1)
					 {
				         System.out.println("true");
					 }
		 }
		 else
		 {
		 System.out.println("false");
		 }
	 }

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		checkstring();

	}

}
