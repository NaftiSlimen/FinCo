package bank.model;

public class Savings extends BankAccount {
	private BankObserver IBkObsr;
	public Savings(Long accountNumber) {
		super(accountNumber);
		this.IBkObsr=new BankObserver();
	}

}
