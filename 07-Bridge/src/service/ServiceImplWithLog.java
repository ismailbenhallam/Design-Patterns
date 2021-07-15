package service;

import dao.Dao;

import java.util.List;

public class ServiceImplWithLog extends Service {

	public ServiceImplWithLog(Dao dao) {
		super(dao);
	}

	@Override
	public String validateAndSave(List<String> data) {
		System.out.println("ServiceImplWithLog.validateAndSave()");
		// validation..
		return getDao() == null ? "Dao is null !" : getDao().save(data);
	}

}
