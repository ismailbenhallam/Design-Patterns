
public abstract class Handler {
    private Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public Handler() {
    }

    public void handleRequest(Object o) {
        if (successor != null) {
            successor.handleRequest(o);
        }
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    // Helper method
    public void addSuccessor(Handler handler) {
        if (successor == null) {
            successor = handler;
        } else {
            successor.addSuccessor(handler);
        }
    }
}
