package cCard.Model;

import java.util.List;

import FinCo.model.ICommand;
import FinCo.model.ICommandManager;
import bank.model.IBankCommands;

public class CCCommandManager implements ICommandManager {
	private List<CCardCommands> ccardCommands;
	public void addCommandToHistory(CCardCommands command) {
		this.ccardCommands.add(command);
	}
	@Override
	public void submit(ICommand command) {
		command.execute();
		addCommandToHistory((CCardCommands)command);
		
	}
}
