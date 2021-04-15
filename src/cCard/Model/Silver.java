package cCard.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import FinCo.model.Entry;

public class Silver  extends CreditCardAccount{
	
	private Double Mi;
	private Double Mp;
	public Silver( Long accountNumber, String expirationDate) {
		super( accountNumber, expirationDate);
		this.Mi=0.18;
		this.Mp=0.14;
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


}
