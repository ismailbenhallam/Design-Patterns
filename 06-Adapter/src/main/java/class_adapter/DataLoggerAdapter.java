package class_adapter;

import commun.DataLogger;
import commun.Target;

import java.io.File;

public class DataLoggerAdapter extends DataLogger implements Target {

	@Override
	public void save(File f, String data) {
		super.logData(f, data);
	}

}
