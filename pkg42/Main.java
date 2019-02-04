package com.capg.pkg42;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saving s = new Saving(10000);
		Current c = new Current(5000);
		s.withdraw(2000);
		c.withdraw(2000);
	}
}
