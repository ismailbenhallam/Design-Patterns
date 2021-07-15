package dao;

import java.util.List;

public class XmlDao implements Dao {

	@Override
	public String save(List<String> data) {
		// ...
		return "Data saved using XmlDao";
	}
}