package command;

public class LoggingCommand implements Command{

	private LoggingReceiver receiver;
	
	public LoggingCommand(LoggingReceiver receiver) {
		super();
		this.receiver = receiver;
	}

	public LoggingReceiver getReceiver() {
		return receiver;
	}

	public void setReceiver(LoggingReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute(Event e) {
		receiver.action(">> Donn�e ajout�e " + e.getData());
	}

}
