package cCard.Model;

import cCard.View.CCard;

public class GenerateMonthlyBillsCommand implements CCardCommands {
	private CreditCardAccount cc;
	
	public GenerateMonthlyBillsCommand(CreditCardAccount cc) {
		super();
		this.cc = cc;
	}

	@Override
	public void execute() {
		this.cc.generateMonthlyBills();
		
	}

}
