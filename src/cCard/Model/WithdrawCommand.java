	package cCard.Model;

	public class WithdrawCommand implements CCardCommands  {
		private CreditCardAccount cc;	
		private Double amount;
		public WithdrawCommand(CreditCardAccount cc, Double amount) {
			super();
			this.cc = cc;
			this.amount = amount;
		}
		@Override
		public void execute() {
			this.cc.withdraw(amount);
		
		}
	}
