package bank.model;

import cCard.Model.CreditCardAccount;

public class WithdrawCommand implements IBankCommands  {
	private BankAccount bankAccount;
	private Double amount;
	public WithdrawCommand(BankAccount bankAccount, Double amount) {
		super();
		this.bankAccount = bankAccount;
		this.amount = amount;
	}
	@Override
	public void execute() {
		this.bankAccount.withdraw(amount);
	}
}
