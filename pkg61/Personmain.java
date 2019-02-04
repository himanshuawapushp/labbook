package com.capg.pkg61;



public class Personmain {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Person1 obj = new Person1("himanshu", "mishra", 'm');
		System.out.println("first name:" + obj.getFirstName());
		System.out.println("last name:" + obj.getLastName());
		System.out.println("gender" + obj.getGender());
		obj.setFirstName("hims");
		obj.setLastName("mishra");
		obj.setGender('m');
		System.out.println("first name:" + obj.getFirstName());
		System.out.println("last name:" + obj.getLastName());
		System.out.println("gender" + obj.getGender());
		try {
			if (obj.getFirstName().isEmpty() || obj.getLastName().isEmpty()) {
			throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Name Should Not be blank");
		}
	}

}
