package service;

import java.util.Random;

import model.Employee;

public class CredentialServiceImpl extends Employee implements CredentialService {
	

	public CredentialServiceImpl(String firstName, String lastName,String company) {
		super(firstName, lastName,company);		
	}

	@Override
	public String generatePassword() {
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i= 0;i<8;i++) {
			int n= r.nextInt(127-32)+32;
			sb.append((char)n);
		}
		return sb.toString();
	}

	@Override
	public String generateEmail(String firstName,String lastName,String department,String company) {
		String emailId;	
		String name = firstName.concat(lastName);
		emailId = name.concat("@").concat(department).concat("."+company).concat(".com");
		return emailId;
	}

	@Override
	public void showCredential(Employee emp) {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email ---->"+emp.getEmailId());
		System.out.println("Password ---->"+emp.getPassword());
		
	}

}
