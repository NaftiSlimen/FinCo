package mainTest;

import java.time.LocalDate;

import FinCo.model.AbCustomer;
import FinCo.model.AbstractAccountDB;
import cCard.Model.AddCreditCardAccountCommand;
import cCard.Model.CCDB;
import cCard.Model.CreditCardAccount;
import cCard.Model.Gold;
import cCard.Model.Owner;
import cCard.Model.Silver;

public class testCC {

	public static void main(String[] args) {
		CCDB.initDB();
		Owner a = new Owner("mohamed","asser@gmail.com",LocalDate.now());
		Gold c=new Gold(9879846464632132L,LocalDate.now());
		Silver cc=new Silver(9879846464632132L,LocalDate.now());
		//a.addAccount(c);
		//a.addAccount(cc);
		new AddCreditCardAccountCommand(c,a).execute();
		new AddCreditCardAccountCommand(cc,a).execute();
		c.deposit(654654.5);
		c.deposit(100000.0);
		c.withdraw(4654.5);
		cc.deposit(654654.5);
		cc.withdraw(4654.5);
		CCDB.print();
		//System.out.println(((Gold)c).generateMonthlyBills());
		//System.out.println(((Silver)cc).generateMonthlyBills());
		/*((Gold)c).addIntrest();
		((Silver)cc).addIntrest();*/
		CCDB.addIntrest();
		/*System.out.println("**************AFTER add intrest*************");
		System.out.println(((Gold)c).generateMonthlyBills());
		System.out.println(((Silver)cc).generateMonthlyBills());*/
	}

}
