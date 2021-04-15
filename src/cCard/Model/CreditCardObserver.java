package cCard.Model;

import java.time.LocalDateTime;

import FinCo.model.IObserver;

public class CreditCardObserver implements IObserver {

	@Override
	public String update() {
		return "Balance is negative at " + LocalDateTime.now();
		
	}

}
