import java.util.Arrays;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        ArraySorter arraySorter = new ArraySorter(SortAlgorithm.QUICK_SORT);
        print(arraySorter.sort(generateArray()));
    }

    private static void print(int[] sortedArray) {
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] generateArray() {
        return new Random().ints(5000).toArray();
    }
}
