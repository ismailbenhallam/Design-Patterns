import java.util.*;

public class ConcreteBuilder2 implements Builder {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_BLUE = "\u001B[34m";

	@Override
	public Set<String> loadNames() {
		Set<String> names = new HashSet<>();
		names.add("Ayoub Dehbi");
		names.add("Abdellah El Youssfi Alaoui");
		names.add("Ismaïl Benhallam");
		names.add("Mouad Essaadi");
		return names;
	}

	@Override
	public List<String> orderNames(Set<String> names) {
		List<String> list = new ArrayList<>(names);
		list.sort(Comparator.naturalOrder());
		return list;
	}

	@Override
	public List<String> decorateNames(List<String> orderedNames) {
		List<String> list = new ArrayList<>();
		for (String name : orderedNames) {
			list.add(decorate(name.trim()));
		}
		return list;
	}

	private String decorate(String name) {
		return ANSI_RED + "* " + ANSI_BLUE + Character.toUpperCase(name.charAt(0)) + name.substring(1)
				+ ANSI_RED + " *"
				+ ANSI_RESET;
	}

}
