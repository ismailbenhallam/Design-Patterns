import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

// ConcreteStrategy 2
public class BubbleSort implements Sorter {
    private static final Logger logger = Logger.getLogger(BubbleSort.class.getName());

    public BubbleSort() {
        logger.log(Level.INFO, "BubbleSort..");
    }

    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int n = sortedArray.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    swap(sortedArray, j, j + 1);
                }
            }
        return sortedArray;
    }

    private void swap(int[] sortedArray, int index1, int index2) {
        int temp = sortedArray[index1];
        sortedArray[index1] = sortedArray[index2];
        sortedArray[index2] = temp;
    }
}
