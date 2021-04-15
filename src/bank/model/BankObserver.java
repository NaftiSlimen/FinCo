package bank.model;

import java.time.LocalDateTime;

import FinCo.model.IObserver;

public class BankObserver implements IObserver {

	@Override
	public String update() {
		return "Balance is negative at " + LocalDateTime.now();
		
	}
	
}
