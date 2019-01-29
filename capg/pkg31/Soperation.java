package com.capg.pkg31;
import java.util.*;

public class Soperation
{
	public void user(String s,int n)
	{
		String s1=s;
		int x=n;
		
		if(x==1)
		{
			int i;
			char c[]=s1.toCharArray();
			for(i=0;i<s1.length();i++)
			{
				if(i%2!=0)
				{
					c[i]='#';
				}
			}
			for(i=0;i<s1.length();i++)
				System.out.print(c[i]);
		}
		else if (x==2)
		{
		  	String s2= s1+s1;
		  	String s3=s2.replaceAll("\\s", "");
		  	System.out.println(s3);;
		  	
		}
		else if (x==3)
		{
			int index =0;
			int i,j;
			char c[]=s1.toCharArray();
			char a[]=new char[50];
			for(i=0;i<s1.length();i++)
			{
				for(j=0;j<i;j++)
				{
					if(c[i]==c[j])
						break;
				}
				if(j==i)
					a[index++]=c[i];
				
			}
			String s2=new String(a);
			System.out.println(s2);
		}
		else if(x==4)
		{
			int i;
			char c[]=s1.toCharArray();
			for(i=0;i<c.length;i++)
			{
				if(i%2!=0)
				{
					
				c[i]=Character.toUpperCase(c[i]);
				
				}
			}
			String s3= new String(c);
			System.out.println(s3);
		}
	}
	
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("press 1 for inserting #");
		System.out.println("press 2 for adding string itself");
		System.out.println("press 3 for remove duplicate character");
		System.out.println("press 4 for change odd character to upper case);");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s= sc.nextLine();
		System.out.println("enter the choice");
		int n= sc.nextInt();
		Soperation sp = new Soperation();
		sp.user(s,n);
			

	}

}
