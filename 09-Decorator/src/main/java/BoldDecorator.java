// Concrete Decorator
public class BoldDecorator extends HTMLDecorator {

    public BoldDecorator(Component component) {
        super(component);
    }

    @Override
    public String getText() {
        return "<b>" + super.getText() + "</b>";
    }
}
