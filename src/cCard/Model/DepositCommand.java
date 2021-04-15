package cCard.Model;



public class DepositCommand implements CCardCommands  {
	private CreditCardAccount cc;
	private Double amount;
	public DepositCommand(CreditCardAccount cc,Double amount) {
		super();
		this.cc = cc;
		this.amount = amount;
	}
	@Override
	public void execute() {
		this.cc.deposit(amount);
		
	}
}