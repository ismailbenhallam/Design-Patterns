// Singleton
public class Manager extends Employee {
	private static final Manager instance = new Manager();

	private Manager() {
		super(0, "Mohammed Dehbi");
	}

	public static Manager getInstance() {
		return instance;
	}

}