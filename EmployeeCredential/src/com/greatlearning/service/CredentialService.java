package com.greatlearning.service;

import java.util.Random;

public class CredentialService {
	public String generateEmailID(String fname,String sname,String dept) {
		return fname+sname+"@"+dept+".gl.com";
	}
	
	public String generatePassword() {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#$%^&*";
		Random rand = new Random();
		char[]password = new char[8];
		for(int i = 0;i<8;i++) {
			password[i] = passwordset.charAt(rand.nextInt(passwordset.length()));		
		}
		return new String (password);
	
		
	}
	public void showCredentials(String fname,String sname) {
		System.out.println("Dear "+fname+" "+sname+" your generated credentials are as follows");
				
	}
	

}