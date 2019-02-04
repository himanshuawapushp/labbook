package com.capg.pkg43;

public class Person extends Account {
	static private long no = 1;
	private String name;
	private float age;
	private long accnum = no;
	private double balance;
	Person accholder;

	Person() {
		no += 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public long getAccnum() {
		return accnum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccholder(Person accholder) {
		this.accholder = accholder;
	}

	public void deposite(double balance) {
		this.balance += balance;
		System.out.println("balane in account after deposite is::" + this.balance);
	}

	public void withdraw(double balance) {
		this.balance -= balance;
		System.out.println("balane in account after withdraw is::" + this.balance);
	}

	@Override
	public Person getAccholder() {
		// TODO Auto-generated method stub
		return accholder;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", accnum=" + accnum + ", balance=" + balance + ", accholder="
				+ accholder.getName() + "]";
	}

}