

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        final var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("item - " + iterator.next());
        }
    }
}
