
public interface List<T> {
    void add(T t);

    T get(int i);

    int size();

    Iterator<T> iterator();

}
