// Component
public abstract class Node {
    private String name;

    public Node() {
    }

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void remove(int i) {
    }

    public void add(Node n) {
    }

    public Node get(int i) {
        return null;
    }

    public int size() {
        return 0;
    }

    public String tabs(int level) {
        return "\t".repeat(level);
    }

    public String show() {
        return show(0);
    }

    // Operation
    public abstract String show(int level);
}

