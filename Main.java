package com.capg.lab24;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Phone per=new Phone("Himanshu","mishra","g","9598526348");
		System.out.println("First Name"+ per.getFirstName());
		System.out.println("Last Name"+ per.getLastName());
		System.out.println("Gender"+ per.getGender());
		System.out.println("Mobile number"+per.getMobileNo());
		per.setFirstName("vaibhav");
		per.setLastName("shukla");
		per.setMobileNo("8858783007");
		per.setGender("F");
		System.out.println("First"+ per.getFirstName());
		System.out.println("Last"+per.getLastName());
		System.out.println("Gender"+per.getGender());
		System.out.println("Mobile"+per.getMobileNo());
		
		

	}

}
