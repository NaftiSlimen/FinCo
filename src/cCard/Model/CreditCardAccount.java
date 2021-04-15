package cCard.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import FinCo.model.AbstractAccount;
import bank.model.BankObserver;

public abstract class CreditCardAccount extends AbstractAccount{
	private String expirationDate;
	private CreditCardObserver obs;
	public CreditCardAccount( Long accountNumber,String expirationDate) {
		super( accountNumber);
		this.expirationDate=expirationDate;
	}
	public void addObserver(CreditCardObserver obs) {
		this.obs=obs;
	}
	public abstract void addIntrest();
	public abstract String generateMonthlyBills();

}
