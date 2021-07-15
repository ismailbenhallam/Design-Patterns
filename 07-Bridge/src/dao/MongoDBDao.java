package dao;

import java.util.List;

public class MongoDBDao implements Dao {

	@Override
	public String save(List<String> data) {
		// ...
		return "Data saved using MongoDBDao";
	}
}