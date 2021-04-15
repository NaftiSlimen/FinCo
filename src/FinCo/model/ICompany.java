package FinCo.model;

public interface ICompany extends ICustomer {
	public void sendEmail(String email);
	public void addAccount(IAccount account);
}
