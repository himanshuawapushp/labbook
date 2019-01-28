package com.capg.lab35;
import java.time.*;
import java.util.*;
public class Warrantee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Purchased Year Month and Date ");
		int n= sc.nextInt();
		int i= sc.nextInt();
		int j= sc.nextInt();
		System.out.println("Year " +n+ " Month "+i+ " Date " +j);
		System.out.println("Enter the warrantee year and date");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//System.out.println("year" +a+ "month" +b);
		int c= n+a;
		int d= i+b;
		if(d>12)
		{
			c+=1;
			d=d-12;
		}
		System.out.println("Warrantee Expire " +c+ " Year " +d+ " month ");
		
		

	}

}
