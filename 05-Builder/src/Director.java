import java.util.List;
import java.util.Set;

public class Director {
	private final Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void construct() {
		Set<String> loadedNames = builder.loadNames();
		List<String> orderedNames = builder.orderNames(loadedNames);
		List<String> names = builder.decorateNames(orderedNames);

		for (String name : names) {
			System.out.println(name);
		}
	}
}
