package command;

public class ConsoleReceiver implements LoggingReceiver {

	public ConsoleReceiver() {
	}

	public void action(String data) {
		System.out.println(data);
	}
}
