package cCard.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import FinCo.model.Entry;
import FinCo.model.IObserver;

public class Copper extends CreditCardAccount {
	private CreditCardObserver obs;
	private Double Mi=0.20;
	private Double Mp=0.22;
	public Copper( Long accountNumber, String expirationDate) {
		super(accountNumber, expirationDate);
		this.Mi=0.20;
		this.Mp=0.22;
		this.obs=new CreditCardObserver();
		//CCDB.addToDB(this);
	}

	
	public void addIntrest() {
		this.Mi+=0.01;
	}
	public String generateMonthlyBills() {
	
		StringBuffer sb=new StringBuffer();
		sb.append("-Previous balance: ");
		sb.append(this.getBalanceFromLastMonth());
		sb.append("\n");
		sb.append("-Total charges: ");
		sb.append(this.getMonthlyCharges(LocalDateTime.now().getMonth()));
		sb.append("\n");
		sb.append("-Total credits: ");
		sb.append(this.getMonthlyCredits(LocalDateTime.now().getMonth()));
		sb.append("\n");
		Double newBalance=this.getBalance()/*+this.getMonthlyCredits(LocalDateTime.now().getMonth())*/-this.getMonthlyCharges(LocalDateTime.now().getMonth())+
				this.Mi*(this.getBalanceFromLastMonth()-this.getMonthlyCredits(LocalDateTime.now().getMonth()));
		sb.append("-New balance: ");
		sb.append(newBalance);
		sb.append("\n");
		sb.append("-Total Due: ");
		sb.append(this.Mp*newBalance);
		sb.append("\n");
		return sb.toString();
		
		
	}


	@Override
	public IObserver getObserver() {
	
		return this.obs;
	}
	

}
