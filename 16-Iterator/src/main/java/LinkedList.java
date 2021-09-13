public class LinkedList<T> implements List<T> {
    private LinkedList<T> next;
    private T value;

    public LinkedList() {
    }

    public LinkedList(T initialValue) {
        this.value = initialValue;
    }

    @Override
    public void add(T t) {
        if (value == null)
            value = t;
        if (next == null)
            next = new LinkedList<>(t);
        else
            next.add(t);
    }

    @Override
    public T get(int i) {
        if (i == 0) return value;
        if (next == null) return null;
        return next.get(i - 1);
    }

    @Override
    public int size() {
        if (next == null) {
            if (value == null) return 0;
            return 1;
        }
        return 1 + next.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(this);
    }

    private static class ListIterator<T> implements Iterator<T> {
        private LinkedList<T> pointer;

        public ListIterator(LinkedList<T> pointer) {
            this.pointer = pointer;
        }

        @Override
        public T next() {
            if (pointer == null) {
                return null;
            }
            var value = pointer.value;
            pointer = pointer.next;
            return value;
        }

        @Override
        public boolean hasNext() {
            return pointer != null && (pointer.value != null || pointer.next != null);
        }
    }
}
