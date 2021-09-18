//Concrete Decorator
public class ItalicDecorator extends HTMLDecorator {

    public ItalicDecorator(Component component) {
        super(component);
    }

    @Override
    public String getText() {
        return "<i>" + super.getText() + "</i>";
    }
}
