import java.io.File;

public class Facade {
	private final Reader reader;
	private final Writer writer;

	public Facade() {
		reader = new Reader();
		writer = new Writer();
	}

	public String read(File f) {
		return reader.read(f);
	}

	public void write(File f, String data) {
		writer.write(f, data);
	}

}