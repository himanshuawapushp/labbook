package com.capg.lab25;



enum Gender {
	f,m;
}

public class Main {
	

	public static void main(String[] args) {
		Enumber per=new Enumber("Himanshu","mishra",Gender.m,"9598526348");
	System.out.println("First Name"+ per.getFirstName());
	System.out.println("Last Name"+ per.getLastName());
	System.out.println("Gender"+ per.getGender());
	System.out.println("Mobile number"+per.getMobileNo());
	per.setFirstName("vaibhav");
	per.setLastName("shukla");
	
	per.setMobileNo("8858783007");
	per.setGender(Gender.f);
	System.out.println("First"+ per.getFirstName());
	System.out.println("Last"+per.getLastName());
	System.out.println("Gender"+per.getGender());
	System.out.println("Mobile"+per.getMobileNo());
	
		// TODO Auto-generated method stub

	}

}
