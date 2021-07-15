import javax.swing.AbstractButton;
import javax.swing.border.Border;

public interface AbstractFactory {

	Border createBorder();

	AbstractButton createButton();

}
