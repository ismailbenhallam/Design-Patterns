
public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(new StandardConsoleLoggerObserver());
        subject.attach(new ErrorConsoleLoggerObserver());
        final var counterObserver = new CounterObserver();
        subject.attach(counterObserver);

        subject.notifyObservers();
        subject.notifyObservers();
        subject.notifyObservers();

        System.out.println(counterObserver.getCount());
    }
}
