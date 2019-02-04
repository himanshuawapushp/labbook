package com.capg.pkg62;

import com.capg.pkg62.Person;

public class Account {
	private long accnum;
	private double balance;
	Person accholder;
	public Account(long accnum, double balance, Person accholder) {
		super();
		this.accnum = accnum;
		this.balance = balance;
		this.accholder = accholder;
		if(this.balance<500)
		{
			System.out.println("balance should be greater than 500");
		}
	}
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccholder() {
		return accholder;
	}
	public void setAccholder(Person accholder) {
		this.accholder = accholder;
	}
	public void deposite(double balance) {
		this.balance+=balance;
		System.out.println("balane in account after deposite is::"+this.balance);
	}
	public void withdraw(double balance)
	{
		this.balance-=balance;
		System.out.println("balane in account after withdraw is::"+this.balance);
	}
	@Override
	public String toString() {
		return "Account [accnum=" + accnum + ", balance=" + balance + ", accholder=" + accholder.getName() + "]";
	}
	
}