import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;


public class SelectionSortTest {

    private SelectionSorter sorter = new SelectionSorter();

    @Test
    public void shouldDoNothingWithNullArray() {
        int[] values;

        sorter.sort(values);
    }

    @Test
    public void shouldDoNothingWithEmptyArray() {
        int[] values = {};

        sorter.sort(values);
        assertArrayEquals(new int[] {}, values);
    }

    @Test
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {42};

        sorter.sort(values);

        assertArrayEquals(new int[] {42}, values);
    }

    @Test
    public void shouldSortValues() {
        int[] values = { 9, -3, 5, 0, 1};
        int[] expectedOrder = { -3, 0, 1, 5, 9};

        sorter.sort(values);

        assertArrayEquals(expectedOrder, values);
    }
}

class Testx {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SelectionSortTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}

class SelectionSorter {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, Integer.MAX_VALUE+1};
        //sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int findMinIndex(int[] arr, int start, int end) {
        int minIndex = start;
        for (int i = start + 1; i < end; ++i) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public  void sort(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            minIndex = findMinIndex(arr, i, arr.length);
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }
}
