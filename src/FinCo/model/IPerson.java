package FinCo.model;

public interface IPerson extends ICustomer {
	public void addAccount(AbstractAccount account);
	public void sendEmail(String email);
}
