// Flyweight 2
public class Circle extends Shape {
	private static final String TYPE = "Circle";

	public Circle() {
		super(TYPE);
	}

	@Override
	public String calculateSurfaceMethod() {
		return "radius² x PI";
	}

}
