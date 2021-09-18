public class Client {

	public Client() {
		exp01();
	}

	private void exp01() {
		ShapeFactory factory = ShapeFactory.getInstance();

		Shape s1 = factory.getShape("Rectangle");
		Shape s2 = factory.getShape("Circle");

		System.out.println(s1.calculateSurfaceMethod());
		System.out.println(s2.calculateSurfaceMethod());
	}

	public static void main(String[] args) {
		new Client();
	}
}