// Flyweight
public abstract class Shape {
	private String type;

	public Shape(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract String calculateSurfaceMethod();

}