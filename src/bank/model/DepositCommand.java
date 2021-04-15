package bank.model;

import cCard.Model.CreditCardAccount;

public class DepositCommand implements IBankCommands  {
	private BankAccount bankAccount;
	private Double amount;
	public DepositCommand(BankAccount bankAccount, Double amount) {
		super();
		this.bankAccount = bankAccount;
		this.amount = amount;
	}
	@Override
	public void execute() {
		this.bankAccount.deposit(amount);
		
	}
}