import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class BlueLineBorder extends BorderPanel {
	private static final long serialVersionUID = 1L;
	private static final Color COLOR = Color.CYAN;

	public BlueLineBorder(JComponent... components) {
		super(components);
	}

	@Override
	public Border createBorder() {
		return new LineBorder(COLOR, 1);
	}
}
