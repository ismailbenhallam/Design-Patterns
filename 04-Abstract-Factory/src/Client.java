import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client extends JFrame {
	private final String[] buttonLabels = new String[] { " Choix A ", " Choix B " };

	public Client(AbstractFactory factory) {
		JPanel container = new JPanel();
		container.setBorder(factory.createBorder());
		container.setLayout(new FlowLayout());

		for (int i = 0; i < 3; i++) {
			JLabel label = new JLabel("Champs " + (i + 1));
			container.add(label);
			JTextField textField = new JTextField(15);
			container.add(textField);
			textField.setBorder(factory.createBorder());
		}

		ButtonGroup group = new ButtonGroup();
		for (String s : buttonLabels) {
			AbstractButton b = factory.createButton();
			b.setText(s);
			container.add(b);
			group.add(b);
		}

		setContentPane(container);
		setSize(250, 300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private static void exp01() {
		AbstractFactory p1 = new ConcreteFactory1();
		new Client(p1);
	}

	private static void exp02() {
		AbstractFactory p1 = new ConcreteFactory2();
		new Client(p1);
	}

	public static void main(String[] args) {
		exp01();
		exp02();
	}

}
