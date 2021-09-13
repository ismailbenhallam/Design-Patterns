package command;

import java.io.PrintWriter;
import java.util.Vector;

public class FileReceiver implements LoggingReceiver {

	private String source;
	private Vector<String>data;
	public FileReceiver(String source) {
		super();
		this.source = source;
		this.data = new Vector<>();
	}

	@Override
	public void action(String item) {
		data.add(item);
		try {
			PrintWriter out = new PrintWriter(source);
			for (String d : data) {
				out.println(d);
			}
			out.close();
		} catch (Exception e) {
			
		}
	}

}
