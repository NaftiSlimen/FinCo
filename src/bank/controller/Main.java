package bank.controller;

import FinCo.controller.AppMain;
import FinCo.model.AbstractAccount;
import bank.model.AddCompanyAccountCommand;
import bank.model.AddPersonalAccountCommand;
import bank.model.BankAccount;
import bank.model.BankCommandManager;
import bank.model.BankDB;
import bank.model.Company;
import bank.model.DepositCommand;
import bank.model.Person;
import bank.model.WithdrawCommand;

public class Main extends AppMain {
	private BankCommandManager BkCmdMgr;
	public Main() {
		this.BkCmdMgr=new BankCommandManager();
	}
	public AbstractAccount findAccountByNumber(long account) {
		return BankDB.findAccountByNumber(account);
	}
	public void addPersonalAccount(Person person,BankAccount bankAccount) {
		this.BkCmdMgr.submit(new AddPersonalAccountCommand(bankAccount,person));
	}
	public void addCompanyAccount(Company company,BankAccount bankAccount) {
		this.BkCmdMgr.submit(new AddCompanyAccountCommand(bankAccount,company));
	}
	public void addIntrest(Double intrest) {
		
	}
	public void deposit(Long accountNumber, Double amount) {
		this.BkCmdMgr.submit(new DepositCommand((BankAccount)BankDB.findAccountByNumber(accountNumber),amount));
	}
	public void withdraw(Long accountNumber, Double amount) {
		this.BkCmdMgr.submit(new WithdrawCommand((BankAccount)BankDB.findAccountByNumber(accountNumber),amount));
	}
}