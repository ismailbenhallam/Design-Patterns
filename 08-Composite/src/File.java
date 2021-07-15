// Leaf
public class File extends Node {

	public File() {
		super();
	}

	public File(String name) {
		super(name);
	}

	@Override
	public String show(int level) {
		return tabs(level) + "File : " +
				"\"" + getName() + "\"";
	}
}
