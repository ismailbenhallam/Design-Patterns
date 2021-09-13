
public class ErrorConsoleLoggerObserver implements Observer {

    @Override
    public void update(Subject s) {
        System.err.println(">>> ErrorConsoleLoggerObserver.update");
    }
}
