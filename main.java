package com.capg.lab23;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Person per=new Person("Himanshu","Mishra",'M');
		System.out.println("FirstName "+per.getFirstName());
		System.out.println("Last Number "+per.getLastName());
		System.out.println("Gender "+per.getGender());
		per.setFirstName("Awapushp");
		per.setLastName("mishra");
		per.setGender('M');
		System.out.println("First Name "+ per.getFirstName());
		System.out.println("Last NAme "+ per.getLastName());
		System.out.println("Gender "+ per.getGender());
		
		
		

	}

}
