package object_adapter;

import commun.DataLogger;
import commun.Target;

import java.io.File;

public class DataLoggerAdapter implements Target {
	private final DataLogger adapted;

	public DataLoggerAdapter(DataLogger adapted) {
		this.adapted = adapted;
	}

	@Override
	public void save(File f, String data) {
		adapted.logData(f, data);
	}

}