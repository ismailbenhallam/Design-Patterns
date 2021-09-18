package service;

import dao.Dao;

import java.util.List;

public class ServiceImpl extends Service {

	public ServiceImpl(Dao dao) {
		super(dao);
	}

	@Override
	public String validateAndSave(List<String> data) {
		// validation..
		return getDao() == null ? "Dao is null !" : getDao().save(data);
	}

}
