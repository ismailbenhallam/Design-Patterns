import java.util.Hashtable;
import java.util.Map;

// FlyweightFactory
public class ShapeFactory {
	private static final ShapeFactory instance = new ShapeFactory();
	private final Map<String, Shape> cache;

	private ShapeFactory() {
		super();
		cache = new Hashtable<>();
		cache.put("Rectangle", new Rectangle());
		cache.put("Circle", new Circle());
	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	public Shape getShape(String key) {
		return cache.get(key);
	}

	public void addShape(String key, Shape s) {
		cache.put(key, s);
	}

}