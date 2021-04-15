package bank.model;

import java.util.List;

public class Company extends Customer {
	private int noEmployee;
	private List<BankAccount> accounts;

	public Company(String name, String emailAdress, int noEmployee) {
		super(name, emailAdress);
		this.noEmployee=noEmployee;
	}
	
	@Override
	public void sendEmail(String email) {
		// TODO Auto-generated method stub
		
	}
}
