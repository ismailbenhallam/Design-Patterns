import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.border.Border;

public class SoftBevelBorder extends BorderPanel {
	private static final long serialVersionUID = 1L;
	private static final Color COLOR1 = Color.BLACK;
	private static final Color COLOR2 = Color.RED;

	public SoftBevelBorder(JComponent... components) {
		super(components);
	}

	@Override
	public Border createBorder() {
		return new javax.swing.border.SoftBevelBorder(1, COLOR1, COLOR2);
	}
}