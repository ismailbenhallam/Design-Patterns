public class Client {

	public Client() {
		exp01();
	}

	private void exp01() {
		File f1 = new File("Design-Patterns.docx");
		File f2 = new File("JavaScript.pdf");
		File f3 = new File("JavaEE-8.pdf");

		Directory courses = new Directory("Courses");
		courses.add(f1);
		courses.add(f2);
		courses.add(f3);

		Directory images = new Directory("Images");
		File i1 = new File("image.png");
		images.add(i1);

		Directory data = new Directory("Data");
		data.add(images);
		data.add(courses);

		System.out.println(data.show());
	}

	public static void main(String[] args) {
		new Client();
	}
}