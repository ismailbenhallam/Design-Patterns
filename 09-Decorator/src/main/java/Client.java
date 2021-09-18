public class Client {

	public Client() {
		exp01();
	}

	private void exp01() {
		Component component = new SimpleComponent("Ismaïl");
		Component boldItalicDecors = new ItalicDecorator(
				new BoldDecorator(component));
		System.out.println(boldItalicDecors.getText());
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

	public static void main(String[] args) {
		new Client();
	}

}
