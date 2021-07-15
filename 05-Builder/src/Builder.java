import java.util.List;
import java.util.Set;

public interface Builder {

	Set<String> loadNames();

	List<String> orderNames(Set<String> names);

	List<String> decorateNames(List<String> ordredNames);

}