package com.capg.lab41;
import java.util.*;

public class Banking {
	 static Scanner sc = new Scanner(System.in);
	
	public static void account()
	{
		
		
		while(true)
		{
		System.out.println("Press 1 for Account open ");
		System.out.println("Press 2 for Balance check");
		System.out.println("Press 3 for Withdrawal");
		System.out.println("Press 4 for Deposite");
		System.out.println("Press 5 for Exit ");
		int n = sc.nextInt();
		switch(n)
		{
		case 1: openAcc();
		break;
		case 2:balcheck();
		break;
		case 3:balwith();
		break;
		case 4:baldeposite();
		break;
		case 5: exit();
		break;
		default: System.out.println("Wrong choice");
		}
		}
	}
 static int b=0, x=0;
	private static void exit() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	private static void baldeposite() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount for Deposite");
		int a = sc.nextInt();
		x=x+a;
		System.out.println("Total Amount after deposite: "+x);
		
	}

	private static void balwith() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount for withdrawal");
		int a = sc.nextInt();
		if(x > 1000)
		{
			x=x-a;
			System.out.println("Remaining Balance: " + x);
		}
		else
		{
			System.out.println("Insufficient Amount");
		}
		
	}

	private static void balcheck() {
		// TODO Auto-generated method stub
		System.out.println("Total amount: "+ x);
		
	}

	private static void openAcc() {
		// TODO Auto-generated method stub
		System.out.println("Enter the account holder name");
		String str = sc.next();
		System.out.println("Enter the initial amount ");
		 x = sc.nextInt();
		b+=14345;
		System.out.println("Account number: " + b + "\nAccount Holder name: " + str + "\nAccount balance: "+ x);
		
	}

	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome to kangGal bank");
		account();

	}

}
