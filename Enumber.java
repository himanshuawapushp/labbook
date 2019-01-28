package com.capg.lab25;

public class Enumber {
	
	

		private String firstName;
		private String lastName;
		private Gender gender;
		public Enumber(String firstName, String lastName, Gender gender, String mobileNo) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.mobileNo = mobileNo;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		private String mobileNo;
		
	}

	
	


