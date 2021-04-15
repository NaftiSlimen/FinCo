package bank.model;

public class Chekings extends BankAccount {
	private BankObserver IBkObsr;
	public Chekings(Long accountNumber) {
		super(accountNumber);
		this.IBkObsr=new BankObserver();
	}

}
