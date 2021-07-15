// Flyweight 1
public class Rectangle extends Shape {
	private static final String TYPE = "Rectangle";

	public Rectangle() {
		super(TYPE);
	}

	@Override
	public String calculateSurfaceMethod() {
		return "width x height";
	}

}