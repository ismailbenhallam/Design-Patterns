import java.io.File;

public class Client {
	private final File f = new File("10-Facade/resources/facade.txt");

	public Client() {
		exp01();
	}

	private void exp01() {
		Facade facade = new Facade();
		facade.write(f, "write something");
		System.out.println(facade.read(f));
	}

	public static void main(String[] args) {
		new Client();
	}

}
