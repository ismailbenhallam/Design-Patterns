import java.io.File;

public class Client {
	private final File file = new File("resources/proxy.txt");

	public Client() {
		exp02();
	}

	void exp01() {
		Reader subject = new RealReader();
		System.out.println(subject.read(file));
	}

	void exp02() {
		Reader subject = new LogProxy(new RealReader());
		System.out.println(subject.read(file));
	}

	public static void main(String[] args) {
		new Client();
	}
}
