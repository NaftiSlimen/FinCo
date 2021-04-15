package bank.model;

import java.util.ArrayList;
import java.util.List;

import FinCo.model.AbstractAccount;
import FinCo.model.AbstractAccountDB;
import cCard.Model.CreditCardAccount;

public class BankDB extends AbstractAccountDB {

	
	private static List<BankAccount> accountDB;
	private static List<Customer> customerDB;
	public BankDB() {
		super();
		accountDB=new ArrayList<>();
	}
	public static void initDB() {
		accountDB=new ArrayList<>();
	}
	public static AbstractAccount findAccountByNumber(Long accNum) {
		for (AbstractAccount a:accountDB) {
			System.out.println("YO");
			System.out.println(a.getaccountNumber());
			if (a.getaccountNumber()==accNum) return a;
		}
		return null;
	}
	public static void print() {
		for (AbstractAccount a:accountDB) System.out.println(a.toString());
	}

	public static void addToDB(AbstractAccount account) {
		accountDB.add((BankAccount)account);
		
	}
	public static void addCustomerToDB(Customer customer) {
		customerDB.add(customer);
		
	}

}
