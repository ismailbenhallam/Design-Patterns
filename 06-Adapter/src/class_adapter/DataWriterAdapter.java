package class_adapter;

import java.io.File;

import DataWriter;
import Target;

public class DataWriterAdapter extends DataWriter implements Target {

	@Override
	public void save(File f, String data) {
		super.writeData(f, data);
	}

}
