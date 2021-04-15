package cCard.Model;

import java.util.List;
import java.util.ArrayList;
import FinCo.model.ICommand;
import FinCo.model.ICommandManager;
import bank.model.IBankCommands;

public class CCCommandManager implements ICommandManager {
	private List<CCardCommands> ccardCommands;
	public CCCommandManager() {
		this.ccardCommands=new ArrayList<>();
	}
	public void addCommandToHistory(CCardCommands command) {
		this.ccardCommands.add(command);
	}
	@Override
	public void submit(ICommand command) {
		((CCardCommands)command).execute();
		addCommandToHistory((CCardCommands)command);
		
	}
}
