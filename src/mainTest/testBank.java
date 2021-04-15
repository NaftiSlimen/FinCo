package mainTest;

import java.time.LocalDate;

import FinCo.model.AbCustomer;
import bank.model.AddPersonalAccountCommand;
import bank.model.Address;
import bank.model.BankAccount;
import bank.model.BankDB;
import bank.model.Chekings;
import bank.model.Company;
import bank.model.Person;
import bank.model.Savings;

public class testBank {
	public static void main (String[] args) {
		BankDB.initDB();
		AbCustomer a= new Company("SICAM","sicam@tn",2);
		Person aa= new Person("lamin","lamine@tn","06/08/1992",new Address("street","zip","city","state"));
		BankAccount b= new Chekings(123456L);
		BankAccount bb= new Savings(7891020L);
		/*a.addAccount(b);
		a.addAccount(bb);
		aa.addAccount(b);
		aa.addAccount(bb);*/
		new AddPersonalAccountCommand(b,aa).execute();
		new AddPersonalAccountCommand(bb,aa).execute();
		b.deposit(4500.0);
		b.withdraw(500.0);
		bb.deposit(1000.0);
		bb.withdraw(900.0);
		BankDB.print();
		System.out.println(	b.getBalance()+"     "+bb.getBalance());
	
		
		
	}
}
