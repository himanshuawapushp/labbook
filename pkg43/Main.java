package com.capg.pkg43;

public class Main {

	public static void main(String[] args) {

		Person a1 = new Person();

		Person a2 = new Person();

		a1.setName("smith");
		a2.setName("kathy");

		a1.setAge(20.0f);
		a2.setAge(21.0f);

		a1.setBalance(1000);
		a2.setBalance(2000);

		a1.setAccholder(a1);
		a2.setAccholder(a2);

		System.out.println(a1.toString());
		System.out.println(a2.toString());
		a1.deposite(2000);
		a2.withdraw(2000);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}

}