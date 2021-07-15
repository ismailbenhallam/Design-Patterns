import decorator.Component;

public abstract class HTMLDecorator implements Component {
	private final Component component;

	public HTMLDecorator(Component component) {
		this.component = component;
	}

	@Override
	public String getText() {
		return component.getText();
	}
}
