package cCard.Controller;

import FinCo.controller.AppMain;
import bank.model.BankCommandManager;
import cCard.Model.*;
 
public class Main extends  AppMain {
	 
	private CCCommandManager  ccCommandManager;
	private CCDB  dataBase;
	public Main() {
		this.ccCommandManager=new CCCommandManager();
	}
	public void findCreditCardbyNumber(long account) {
		
	}
	public void addCreditCardAccount(Owner person,CreditCardAccount ccAccount) {
		this.ccCommandManager.submit(new AddCreditCardAccountCommand(ccAccount,person));
	}
	 
	public void addIntrest(Double intrest) {
		CCDB.addIntrest();
	}
	public void deposit(CreditCardAccount accountNumber, Double amount) {
		this.ccCommandManager.submit(new DepositCommand(accountNumber,amount));
	}
	public void withdraw(CreditCardAccount accountNumber, Double amount) {
		this.ccCommandManager.submit(new WithdrawCommand(accountNumber,amount));
	}
	
	public void generateMonthlyBills(CreditCardAccount ccAccount) {
		 this.ccCommandManager.submit(new GenerateMonthlyBillsCommand(ccAccount));
	}
}