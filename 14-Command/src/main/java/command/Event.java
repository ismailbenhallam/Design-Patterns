package command;

public class Event {

	private Object source;
	private Object data;
	
	public Event() {
	}

	public Event(Object source, Object data) {
		super();
		this.source = source;
		this.data = data;
	}

	public Object getSource() {
		return source;
	}

	public void setSource(Object source) {
		this.source = source;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Event [source=" + source + ", data=" + data + "]";
	}
	
	

}
