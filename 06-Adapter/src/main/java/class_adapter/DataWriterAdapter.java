package class_adapter;

import commun.DataWriter;
import commun.Target;

import java.io.File;

public class DataWriterAdapter extends DataWriter implements Target {

	@Override
	public void save(File f, String data) {
		super.writeData(f, data);
	}

}
