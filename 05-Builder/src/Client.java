public class Client {

	public static final String NAMES_TXT = "05-Builder/resources/names.txt";

	public Client() {
		exp01();
		System.out.println("_______\n");
		exp02();
	}

	void exp01() {
		Director director = new Director(new ConcreteBuilder1(NAMES_TXT));
		director.construct();
	}

	void exp02() {
		Director director = new Director(new ConcreteBuilder2());
		director.construct();
	}

	public static void main(String[] args) {
		new Client();
	}
}
