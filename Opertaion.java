package com.capg.lab31;
import java.util.*;
public class Opertaion {
	    static Scanner sc = new Scanner(System.in);
	  
		static String st = sc.nextLine();
	 public static void operation()
	 {
		
	
		System.out.println("1. Add the String");
		System.out.println("2. Replace odd position with #");
		System.out.println("3. Remove duplicate character in the String");
		System.out.println("4. Change odd character to Upper case");
		System.out.println("Enter your choice");
		int n= sc.nextInt();
				switch(n)
				{
				case 1: addstring();
				break;
				case 2: replace();
				break;
				case 3: duplicate();
				break;
				case 4: uppcase();
				break;
				default: System.out.println("Wrong choice");
				}
		 }
	  public static void addstring()
	  {
		  String st1 = st+st;
		  System.out.println(st1);
	  }
	  public static void replace()
	  {
		  String a[]= st.split(""); 
		  for(int i=0;i<st.length();i+=2)
		  {
			  a[i]="#";
			  
		  }
		  for(int i=0;i<st.length();i++)
		  {
			  System.out.print(a[i]);
		  }
	  }
	  public static void duplicate()
	  {
		  String a[]= st.split("");
		  for(int i=0;i<st.length();i++)
			  
		  {
			  if(a[i]!=null)
			  {
			  for(int j=i+1;j<st.length();j++)
			  {
				  if(a[i].equals(a[j]))
				  {
					  a[j]=null; 
				  }
			  }  
			  }
		  }
		  for(int i=0;i<st.length();i++)
		  {
			  if(a[i]!=null)
			  {
				  System.out.print(a[i]);
			  }
		  }
	  }
	  public static void uppcase()
	  {
		  String a[]= st.split("");
		  for(int i=0;i<st.length();i+=2)
		  {
			a[i]= a[i].toUpperCase();
		  }
		  for(int i=0;i<st.length();i++)
		  {
			 System.out.print(a[i]); 
		  }
	  }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		operation();

	}

}
