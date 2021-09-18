import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConcreteBuilder1 implements Builder {
    private final String source;

    public ConcreteBuilder1(String source) {
        this.source = source;
    }

    @Override
    public Set<String> loadNames() {
        try {
            return Files.lines(Path.of(getClass().getClassLoader().getResource(source).toURI())).collect(Collectors.toSet());
        } catch (IOException | URISyntaxException e) {
            System.out.println("Erreur : " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<String> orderNames(Set<String> names) {
        List<String> list = new ArrayList<>(names);
        list.sort((name1, name2) -> name2.compareToIgnoreCase(name1));
        return list;
    }

    @Override
    public List<String> decorateNames(List<String> orderedNames) {
        List<String> list = new ArrayList<>();
        for (String name : orderedNames) {
            list.add(decorate(name));
        }
        return list;
    }

    private String decorate(String name) {
        return "<< " + name.toUpperCase() + " >>";
    }

}
