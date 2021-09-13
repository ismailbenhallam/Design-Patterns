import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {
        Handler chain = new NullHandler(new IntegerHandler(new CharSequenceHandler(new DefaultHandler())));

//        Handler chain = new NullHandler();
//        chain.addSuccessor(new CharSequenceHandler());
//        chain.addSuccessor(new IntegerHandler());
//        chain.addSuccessor(new DefaultHandler());

        Stream.of(
                "Ismaïl benhallam",
                5,
                null,
                new StringBuilder("hello world"),
                Runtime.getRuntime())
                .forEachOrdered(o -> {
                    System.out.println("---------");
                    chain.handleRequest(o);
                });
    }
}
