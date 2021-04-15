package bank.model;

public class AddPersonalAccountCommand implements IBankCommands  {
	private BankAccount bankAccount;
	private Person person;
	
	public AddPersonalAccountCommand(BankAccount bankAccount, Person person) {
		super();
		this.bankAccount = bankAccount;
		this.person = person;
	}

	@Override
	public void execute() {
		//System.out.println("success");
		this.person.addAccount(bankAccount);
		BankDB.addToDB(bankAccount);
	}

}
