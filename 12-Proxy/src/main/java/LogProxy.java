import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Proxy
public class LogProxy implements Reader {
	private final Reader realObject;

	public LogProxy(Reader realObject) {
		this.realObject = realObject;
	}

	@Override
	public String read(File f) {
		System.out.println("Reader.read() called at : "
				+ LocalDateTime.now()
						.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		return realObject.read(f);
	}

}