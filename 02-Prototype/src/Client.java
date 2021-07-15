public class Client {
	public Client() {
		exp01();
	}

	private void exp01() {
		Shape rect1 = new Shape("Rectangle");
//		Shape rect2 = new Shape("Rectangle");
		Shape rect2 = rect1.clone();
		System.out.println(rect1 == rect2); // false
	}

	public static void main(String[] args) {
		new Client();
	}

}
