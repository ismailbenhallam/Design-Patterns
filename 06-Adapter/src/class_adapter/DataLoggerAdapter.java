package class_adapter;

import java.io.File;

import Target;
import DataLogger;

public class DataLoggerAdapter extends DataLogger implements Target {

	@Override
	public void save(File f, String data) {
		super.logData(f, data);
	}

}
