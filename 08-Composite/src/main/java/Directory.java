import java.util.ArrayList;
import java.util.List;

// Composite
public class Directory extends Node {
    List<Node> nodes = new ArrayList<>();

    public Directory() {
    }

    public Directory(String name) {
        super(name);
    }

    @Override
    public void add(Node n) {
        nodes.add(n);
    }

    @Override
    public Node get(int i) {
        return nodes.get(i);
    }

    @Override
    public void remove(int i) {
        nodes.remove(i);
    }

    @Override
    public int size() {
        return nodes.size();
    }

    @Override
    public String show(int level) {
        StringBuilder sb = new StringBuilder(tabs(level))
                .append("Directory : ").append(ANSI_GREEN).append(" (\"")
                .append(getName()).append("\")").append(ANSI_RESET)
                .append(" [\n");
        for (int i = 0; i < size(); i++) {
            sb.append(nodes.get(i).show(level + 1));
            if (i < size() - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }
        sb.append(tabs(level)).append("]");
        return sb.toString();
    }

}

