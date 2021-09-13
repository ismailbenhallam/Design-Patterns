
public class StandardConsoleLoggerObserver implements Observer {

    @Override
    public void update(Subject s) {
        System.out.println(">>> StandardConsoleLoggerObserver.update");
    }
}
