package decorator;

public class SimpleComponent implements Component {
	private final String value;

	public SimpleComponent(String value) {
		this.value = value;
	}

	@Override
	public String getText() {
		return value;
	}
}
