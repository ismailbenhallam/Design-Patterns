
public class IntegerHandler extends Handler {

    public IntegerHandler() {
    }

    public IntegerHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Object o) {
        if (o instanceof Integer) {
            final var i = Integer.parseInt(o.toString());
            System.out.printf(">> %s%n>> %d pow2 => %d%n", getClass().getName(), i, (int) Math.pow(i, 2));
        } else
            super.handleRequest(o);
    }
}
