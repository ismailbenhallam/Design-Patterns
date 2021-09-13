import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void notifyObservers() {
        observers.forEach(o -> o.update(this));
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }
}
