// Prototype
public class Shape implements Cloneable {
	private String type;

	public Shape(String type) {
		this.type = type;
	}

	@Override
	public Shape clone() {
		try {
			return (Shape) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Erreur : " + e);
			return null;
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Shape{" +
				"type='" + type + '\'' +
				'}';
	}
}