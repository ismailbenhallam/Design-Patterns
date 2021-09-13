import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BubbleSortTest {
    private BubbleSort quickSort;

    @BeforeEach
    void setUp() {
        quickSort = new BubbleSort();
    }

    @Test
    void sort() {
        assertArrayEquals(new int[]{-543, -1, 1, 3, 4, 5, 9, 78}, quickSort.sort(new int[]{4, 5, 3, 1, 9, -1, 78, -543}));
    }

    @Test
    void arraySorter() {
        ArraySorter arraySorter = new ArraySorter(SortAlgorithm.BUBBLE_SORT);
        final var sortedArray = arraySorter.sort(new Random().ints(5000).toArray());
        final var length = sortedArray.length;
        for (int i = 0; i < length - 1; i++) {
            assertTrue(sortedArray[i] < sortedArray[i + 1]);
        }
    }
}