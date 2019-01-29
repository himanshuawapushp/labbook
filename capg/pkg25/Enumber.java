package com.capg.pkg25;
   enum Gender {
	 F,M;
 }

public class Enumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Gen obj=new Gen("Himanshu", "Mishra", Gender.M);
		System.out.println("first name:" +obj.getFirstName());
		System.out.println("last name:" +obj.getLastName());
		System.out.println("gender" +obj.getGender());
		obj.setFirstName("Awapushp");
		obj.setLastName("mishra");
		obj.setGender(Gender.F);
		System.out.println("first name:" +obj.getFirstName());
		System.out.println("last name:" +obj.getLastName());
		System.out.println("gender" +obj.getGender());
		
				
	}

}
