package service;

import model.Employee;

public interface CredentialService {
	
	String generatePassword();
	String generateEmail(String firstName,String lastName,String department,String company);
	void showCredential(Employee emp);
}
