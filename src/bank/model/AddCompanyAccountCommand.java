package bank.model;

public class AddCompanyAccountCommand implements IBankCommands  {
	private BankAccount bankAccount;
	private Company company;
	@Override
	public void execute() {
		this.company.addAccount(bankAccount);
		BankDB.addToDB(bankAccount);
	}
	public AddCompanyAccountCommand(BankAccount bankAccount, Company company) {
		super();
		this.bankAccount = bankAccount;
		this.company = company;
	}

}
