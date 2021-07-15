import decorator.Component;

public class BoldDecorator extends HTMLDecorator {

	public BoldDecorator(Component compoenent) {
		super(compoenent);
	}

	@Override
	public String getText() {
		return "<b>" + super.getText() + "</b>";
	}
}
