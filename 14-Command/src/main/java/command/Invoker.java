package command;

import java.util.Vector;

public class Invoker {

	private Command command = null;
	private Vector<Integer>data;
	
	public Invoker() {
		data = new Vector<>();
	}
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	public Invoker(Command command) {
		super();
		this.command = command;
		data = new Vector<>();
	}

	public void add(int item) {
		data.add(item);
		if(command != null) {
			command.execute(new Event(this, item));
		}
		
	}
	
	public Vector<Integer> getData() {
		return data;
	}
	
}
