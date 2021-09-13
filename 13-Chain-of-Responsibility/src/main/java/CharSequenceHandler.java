
public class CharSequenceHandler extends Handler {

    public CharSequenceHandler() {
    }

    public CharSequenceHandler(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Object o) {
        if (o instanceof CharSequence) {
            System.out.printf(">> %s%n>> %s toUpperCase => %s%n", getClass().getName(), o, o.toString().toUpperCase());
        } else
            super.handleRequest(o);
    }
}
