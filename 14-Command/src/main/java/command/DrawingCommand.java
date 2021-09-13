package command;

public class DrawingCommand implements Command{

	private PanelReceiver receiver;
	

	public DrawingCommand() {
	}

	
	public DrawingCommand(PanelReceiver receiver) {
		super();
		this.receiver = receiver;
	}

	public PanelReceiver getReceiver() {
		return receiver;
	}
	
	public void setReceiver(PanelReceiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute(Event e) {
		if(e.getData() instanceof Integer) {
			receiver.action((int)e.getData());
		}
	}

}
