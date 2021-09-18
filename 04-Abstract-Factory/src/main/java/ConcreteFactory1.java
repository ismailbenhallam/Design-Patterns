import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class ConcreteFactory1 implements AbstractFactory {
	private static final Color COLOR1 = new Color(122, 218, 192);
	private static final Color COLOR2 = new Color(32, 3, 113);

	@Override
	public AbstractButton createButton() {
		return new JCheckBox();
	}

	@Override
	public Border createBorder() {
		return new EtchedBorder(1, COLOR1, COLOR2);
	}

}
