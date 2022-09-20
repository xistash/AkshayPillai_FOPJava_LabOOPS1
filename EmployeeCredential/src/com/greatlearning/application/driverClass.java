package com.greatlearning.application;
import java.util.*;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;



public class driverClass {
	public static void main(String[] args) {
		Employee e1 = new Employee();
				
		CredentialService cs = new CredentialService();
		String generateEmail=" ";
		String generatePWD = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resouce");
		System.out.println("4. Legal");
		int choice = sc.nextInt(); 
		
		switch(choice) {
		case 1:
			 generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Tech".toLowerCase());
			 generatePWD=cs.generatePassword();
			 cs.showCredentials(e1.getFirstName(),e1.getLastName());
			 System.out.println("Email ----->"+generateEmail);
			 System.out.println("Password ----->"+generatePWD);			 
			 break;
			 
		case 2:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Admin".toLowerCase());
			generatePWD=cs.generatePassword();
			cs.showCredentials(e1.getFirstName(),e1.getLastName());
			System.out.println("Email ----->"+generateEmail);
		    System.out.println("Password ----->"+generatePWD);
			break;
			
		case 3:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"HumanResource".toLowerCase());
			generatePWD=cs.generatePassword();
			cs.showCredentials(e1.getFirstName(),e1.getLastName());
			System.out.println("Email ----->"+generateEmail);
			System.out.println("Password ----->"+generatePWD);
			break;
			
		case 4:
			generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"Legal".toLowerCase());
			generatePWD=cs.generatePassword();
			cs.showCredentials(e1.getFirstName(),e1.getLastName());
			 System.out.println("Email ----->"+generateEmail);
			 System.out.println("Password ----->"+generatePWD);
			break;
			
		default:
				System.out.println("Please enter a valid option");
		}
		
		 
		 sc.close();
	}
	
}