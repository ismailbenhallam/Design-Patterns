import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.border.SoftBevelBorder;

public class ConcreteFactory2 implements AbstractFactory {
	private static final Color COLOR1 = new Color(245, 181, 27);
	private static final Color COLOR2 = new Color(19, 62, 89);

	@Override
	public Border createBorder() {
		return new SoftBevelBorder(1, COLOR1, COLOR2);
	}

	@Override
	public AbstractButton createButton() {
		return new JRadioButton();
	}

}
