package cCard.Model;

import cCard.View.CCard;

public class GenerateMonthlyBillsCommand implements CCardCommands {
	private CreditCardAccount cc;
	@Override
	public void execute() {
		this.cc.generateMonthlyBills();
		
	}

}
