package bank.model;

import java.util.ArrayList;
import java.util.List;

import FinCo.model.ICommand;
import FinCo.model.ICommandManager;

public class BankCommandManager implements ICommandManager {
	private List<IBankCommands> history;
	public BankCommandManager() {
		this.history=new ArrayList<>();
	}
	public void addCommandToHistory(IBankCommands command) {
		this.history.add(command);
	}
	@Override
	public void submit(ICommand command) {
		command.execute();
		addCommandToHistory((IBankCommands)command);
		
	}

}
