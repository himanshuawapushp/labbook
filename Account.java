package com.capg.lab41;

	import java.util.*;

	public class Account {
		static int a;
		static Scanner sc=new Scanner(System.in);
		static long[] accNum=new long[100];
		static double[] balance=new double[100];
		static String[] name=new String[100];
		static float[] age=new float[100];
		
		static String name1;
		static int flag=0;
		public static void main(String[] args) {
			account();
		}

		private static void account() {
			while(true) {
				System.out.println("1.Add Account");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Get Balance");
				System.out.println("5. Exit");
				System.out.println("Enter your choice");
				int ch=sc.nextInt();
				switch(ch) {
				case 1: add();
				break;
				case 2:deposit();
				break;
				case 3:withdraw();
				break;
				case 4:balance();
				break;
				case 5:exit();
				break;
				default: System.out.println("Wrong Choice");
				}
			}
		}

		private static void exit() {
			System.exit(0);
		}

		private static void balance() {
			System.out.println("Enter Account Holder Name");
			name1=sc.next();
			for(int i=0;i<a;i++) {
				if(name1.equals(name[i])) {
					System.out.println(name[i]+" your current balance is :"+balance[i]);
				}
			}
		}

		private static void withdraw() {
			System.out.println("Enter Amount to withdraw:");
			int bal=sc.nextInt();
			System.out.println("Enter Account Holder Name");
			name1=sc.next();
			for(int i=0;i<a;i++) {
				if(name1.equals(name[i])) {
					if((balance[i]-bal)>=500) {
						balance[i]-=bal;
						System.out.println("Collect your amount...");
					}
					else {
						System.out.println("Sorry not enough balance...");
					}
				}
			}
		}

		private static void deposit() {
			System.out.println("Enter Amount to deposit :");
			int bal=sc.nextInt();
			System.out.println("Enter Account Holder Name");
			name1=sc.next();
			for(int i=0;i<a;i++) {
				if(name1.equals(name[i])) {
					balance[i]+=bal;
					System.out.println("Amount Added Successfully...");
				}
			}
			
		}

		private static void add() {
			System.out.println("Enter number of account:");
			a=sc.nextInt();
			for(int i=0;i<a;i++) {
				System.out.println("Enter name:");
				name[i]=sc.next();
				System.out.println("Enter age");
				age[i]=sc.nextFloat();
				System.out.println("Enter initial ammount");
				balance[i]=sc.nextDouble();
				accNum[i]=14398+i*10;
				System.out.println("Your Account number is: "+accNum[i]);
			}	
		}
}
