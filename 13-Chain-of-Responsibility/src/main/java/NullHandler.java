public class NullHandler extends Handler {

    public NullHandler() {
    }

    public NullHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Object o) {
        if (o == null) {
            System.out.printf(">> %s%n>> Please try to pass a non null object!%n", getClass().getName());
        } else
            super.handleRequest(o);
    }
}
