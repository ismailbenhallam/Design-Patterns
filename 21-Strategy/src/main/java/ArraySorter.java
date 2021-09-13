
// Context
public class ArraySorter {
    private Sorter sorter;
    private final SortAlgorithm algorithm;

    public ArraySorter(SortAlgorithm algorithm) {
        this.algorithm = algorithm;
        switch (algorithm) {
            case QUICK_SORT:
                sorter = new QuickSort();
                break;
            case BUBBLE_SORT:
                sorter = new BubbleSort();
                break;
        }
    }

    public int[] sort(int[] array) {
        final var start = System.currentTimeMillis();
        final var sorted = sorter.sort(array);
        final var end = System.currentTimeMillis();
        System.out.printf("--> %d millis to sort this array (%s)%n", end - start, algorithm);
        return sorted;
    }

    public SortAlgorithm getAlgorithm() {
        return algorithm;
    }
}
