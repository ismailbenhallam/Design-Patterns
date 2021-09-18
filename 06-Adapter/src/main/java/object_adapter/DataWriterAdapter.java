package object_adapter;

import commun.DataWriter;
import commun.Target;

import java.io.File;

public class DataWriterAdapter implements Target {
	private final DataWriter adapted;

	public DataWriterAdapter(DataWriter adapted) {
		this.adapted = adapted;
	}

	@Override
	public void save(File f, String data) {
		adapted.writeData(f, data);
	}

}