import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.Border;

public abstract class BorderPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public BorderPanel(JComponent... components) {
		for (JComponent c : components) {
			c.setBorder(createBorder());
			add(c);
		}
	}

	// Factory Method
	public abstract Border createBorder();

}
