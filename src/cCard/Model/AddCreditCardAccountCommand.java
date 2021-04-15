package cCard.Model;

public class AddCreditCardAccountCommand implements CCardCommands  {
	private CreditCardAccount cc;
	private Owner owner;
	public AddCreditCardAccountCommand(CreditCardAccount cc, Owner owner) {
		super();
		this.cc = cc;
		this.owner=owner;
	}
	@Override
	public void execute() {
		this.owner.addAccount(cc);
		CCDB.addToDB(cc);
	}

}
