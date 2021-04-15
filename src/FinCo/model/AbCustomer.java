package FinCo.model;

import java.util.ArrayList;
import java.util.List;

public abstract class AbCustomer implements ICustomer {
	private String name;
	private String emailAdress;
	private List<AbstractAccount> accounts;
	public AbCustomer(String name,String emailAdress) {
		this.name=name;
		this.emailAdress=emailAdress;
		accounts=new ArrayList<>();
	}
	public void addAccount(AbstractAccount account ) {
		this.accounts.add(account);
	}

}
