package cCard.Model;

import java.util.ArrayList;
import java.util.List;

import FinCo.model.AbstractAccount;
import FinCo.model.AbstractAccountDB;


public class CCDB extends AbstractAccountDB{
	private static List<CreditCardAccount> accountDB;
	public CCDB() {
		super();
		accountDB=new ArrayList<>();
	}
	public static void initDB() {
		accountDB=new ArrayList<>();
	}
	public static CreditCardAccount findAccountByNumber(Long accNum) {
		for (CreditCardAccount a:accountDB) {
			if (a.getaccountNumber().equals(accNum)) return a;
		}

		return null;
	}
	public static void print() {
		for (AbstractAccount a:accountDB) System.out.println(a.toString());
	}
	public static void addIntrest() {
		for (AbstractAccount a:accountDB) ((CreditCardAccount)a).addIntrest();
	}
	public static void addToDB(AbstractAccount account) {
		accountDB.add((CreditCardAccount)account);
		
	}
}
