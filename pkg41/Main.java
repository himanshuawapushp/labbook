package com.capg.pkg41;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Smith", 22.0f);
		Person p2 = new Person("Kathy", 21.0f);
		Random rand = new Random();
		int x = rand.nextInt(10000);
		int y = rand.nextInt(10000);
		if (x == y) {
			while (x == y) {
				y = rand.nextInt(10000);
			}
		}
		Account a1 = new Account(x, 2000, p1);
		Account a2 = new Account(y, 2000, p2);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		a1.deposite(2000);
		a2.withdraw(2000);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}

}
