package com.capg.pkg43;

public abstract class Account {
	private long accnum;
	private double balance;
	Person accholder;

	public abstract double getBalance();

	public abstract void setBalance(double balance);

	public abstract Person getAccholder();

	public abstract void setAccholder(Person accholder);

	public abstract void deposite(double balance);

	public abstract void withdraw(double balance);

}
