package bank.model;

import java.time.LocalDate;

public class Person extends Customer {
	private String birthDate;
	private Address adress;
	public Person(String name, String emailAdress,String birthDate, Address address) {
		super(name, emailAdress);
		this.birthDate=birthDate;
		this.adress=address;}

	@Override
	public void sendEmail(String email) {
		// TODO Auto-generated method stub
		
	}
}
