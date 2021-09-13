public class DefaultHandler extends Handler {

    public DefaultHandler() {
    }

    @Override
    public void handleRequest(Object o) {
        System.out.printf(">> %s%n>> %s => %s!%n", getClass().getName(), o.getClass().getName(), o);
    }
}
