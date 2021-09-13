
public class CounterObserver implements Observer {
    private int count;

    @Override
    public void update(Subject s) {
        count++;
    }

    public int getCount() {
        return count;
    }
}
