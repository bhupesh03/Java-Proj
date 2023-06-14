package com.abc;

import java.util.Scanner;

public class AdminReg {
	private String FirstName;
	private String LastName;
	private String MobileNum;
	private String Gender;
	private String EmailId;
	private String Password;
	Scanner AdminRegInput = new Scanner(System.in);

	public void AdminUserReg() {

		System.out.println("Please Enter Your First Name");
		FirstName = AdminRegInput.next();
		System.out.println("Please Enter Your Last Name");
		LastName = AdminRegInput.next();
		System.out.println("Please Enter Your Mobile Number Without +91");
		MobileNum = AdminRegInput.next();
		System.out.println("Please Enter Your Gender");
		Gender = AdminRegInput.next();
		System.out.println("Please Enter Your EmailId");
		EmailId = AdminRegInput.next();
		System.out.println("Please SetUp Your Password");
		Password = AdminRegInput.next();
		AdminRegInput.close();

	}

	public AdminReg(String firstName, String lastName, String mobileNum, String gender, String emailId, String password,
			Scanner adminRegInput) {
		super();
		FirstName = firstName;
		LastName = lastName;
		MobileNum = mobileNum;
		Gender = gender;
		EmailId = emailId;
		Password = password;

	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getMobileNum() {
		return MobileNum;
	}

	public void setMobileNum(String mobileNum) {
		MobileNum = mobileNum;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	
}
