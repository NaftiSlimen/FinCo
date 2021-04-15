package FinCo.model;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAccount implements IAccount {
	private Double balance;
	private Long accountNumber;
	private List<IEntry> transactions;
	private IObserver observer;
	public AbstractAccount(Long accountNumber) {
		this.balance=0.0;
		this.accountNumber=accountNumber;
		this.transactions=new ArrayList<>();
	}
	public void deposit(Double amount) {
		System.out.println("this is a deposit");
		this.balance+=amount;
		this.addEntry(new Entry(new Deposit(),amount,LocalDateTime.now()));
	}
	public void withdraw(Double amount) {
		System.out.println("this is a withdraw");
		this.balance-=amount;
		this.addEntry(new Entry(new Withdraw(),-amount,LocalDateTime.now()));
	}
	public Double getMonthlyCharges(Month m) {
		Double total=0.0;
		for (IEntry e:transactions) {
			if ((e.getDate().getMonth().equals(m)) && (e.getAmount()<0)) total+=e.getAmount();
		}
		return Math.abs(total);
	}
	public Double getMonthlyCredits(Month m) {
		Double total=0.0;
		for (IEntry e:transactions) {
			if ((e.getDate().getMonth().equals(m)) && (e.getAmount()>0)) total+=e.getAmount();
		}
		return Math.abs(total);
	}
	public Double getBalanceFromLastMonth() {
		Double lastMonthBalance=0.0;
		for (IEntry e:transactions) {
			if (e.getDate().getMonth().equals(LocalDateTime.now().minusMonths(1).getMonth())) lastMonthBalance-=e.getAmount();
		}
		return lastMonthBalance;
	}
	public void addEntry(IEntry entry) {
		this.transactions.add(entry);
		
	}
	public Long getaccountNumber() {
		return this.accountNumber;
	}
	public Double getBalance() {
		return this.balance;
	}
	public  IObserver getObserver() {
		return this.observer;
	};
}
