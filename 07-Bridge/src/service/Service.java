package service;

import dao.Dao;

import java.util.List;

public abstract class Service {
	private final Dao dao;

	public Service(Dao dao) {
		this.dao = dao;
	}

	public Dao getDao() {
		return dao;
	}

	public abstract String validateAndSave(List<String> data);

}
