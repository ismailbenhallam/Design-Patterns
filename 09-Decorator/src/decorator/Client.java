package decorator;

import BoldDecorator;
import ItalicDecorator;

public class Client {

	public Client() {
		exp02();
	}

	private void exp01() {
		Component component = new SimpleComponent("Ismaïl");
		Component boldItaliqueDecors = new ItalicDecorator(
				new BoldDecorator(component));
		System.out.println(boldItaliqueDecors.getText());
	}

	public static void main(String[] args) {
		new Client();
	}

	private void exp02() {
		Component name = new SimpleComponent("Ismaïl");
		System.out.println(name.getText());
		System.out.println();
		// */*/*/*/*/*/*/*/*/*/*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/

		Component boldName = new BoldDecorator(name);
		System.out.println(boldName.getText());
		System.out.println();
		// */*/*/*/*/*/*/*/*/*/*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/

		Component italicName = new ItalicDecorator(name);
		System.out.println(italicName.getText());
		System.out.println();
		// */*/*/*/*/*/*/*/*/*/*/*/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/

		Component blodItalic = new ItalicDecorator(new BoldDecorator(name));
		System.out.println(blodItalic.getText());
		System.out.println();

	}

}
