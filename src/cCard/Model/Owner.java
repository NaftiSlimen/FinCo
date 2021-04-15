package cCard.Model;

import java.time.LocalDate;

import FinCo.model.AbCustomer;
import FinCo.model.AbstractAccount;
import FinCo.model.IAccount;
import FinCo.model.IPerson;

public class Owner extends AbCustomer implements IPerson{
	private String birthDate;
	public Owner(String name,String emailAdress,String birthDate) {
		super(name,emailAdress);
		this.birthDate=birthDate;
	}
	public void addPersonalAccount(CreditCardAccount account){
		
	}
	@Override
	public void sendEmail(String email) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addAccount(AbstractAccount account) {
		// TODO Auto-generated method stub
		
	}

}
