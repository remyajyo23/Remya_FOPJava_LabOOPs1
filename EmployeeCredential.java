package main;

import java.util.Scanner;

import service.CredentialServiceImpl;

public class EmployeeCredential {

	public static void main(String[] args) {

		CredentialServiceImpl c1 = new CredentialServiceImpl("Remya","Jyothis","Max");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int dept = sc.nextInt();
		String deptCode;
		switch(dept) {
		case 1:
			deptCode = "tech";
			c1.setEmailId(c1.generateEmail(c1.getFirstName(),c1.getLastName(),deptCode,c1.getCompany()));
			c1.setPassword(c1.generatePassword());
			c1.showCredential(c1); 
			break;
		case 2:
			deptCode = "admin";
			c1.setEmailId(c1.generateEmail(c1.getFirstName(),c1.getLastName(),deptCode,c1.getCompany()));
			c1.setPassword(c1.generatePassword());
			c1.showCredential(c1); 
			break;
		case 3:
			deptCode = "hr";
			c1.setEmailId(c1.generateEmail(c1.getFirstName(),c1.getLastName(),deptCode,c1.getCompany()));
			c1.setPassword(c1.generatePassword());
			c1.showCredential(c1); 
			break;
		case 4:
			deptCode = "legal";
			c1.setEmailId(c1.generateEmail(c1.getFirstName(),c1.getLastName(),deptCode,c1.getCompany()));
			c1.setPassword(c1.generatePassword());
			c1.showCredential(c1); 
			break;
		
		default:
			System.out.println("Invalid department, logging out");
			break;
		}
		
	}

}
