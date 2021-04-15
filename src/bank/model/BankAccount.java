package bank.model;

import FinCo.model.AbstractAccount;
import FinCo.model.IObserver;

public class BankAccount extends AbstractAccount {
	private BankObserver IBkObsr;
	public BankAccount( Long accountNumber) {
		super( accountNumber);
		this.IBkObsr=new BankObserver();
	}
	public BankObserver getObserver(BankObserver obs) {
		return this.IBkObsr;
	}
	@Override
	public IObserver getObserver() {
		return (IObserver)this.IBkObsr;
	
	}

	
	
}


