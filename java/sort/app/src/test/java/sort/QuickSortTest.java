package sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {
  @Test
  public void testQuickSort() {
    int[] testArray1 = {4, 3, 5, 2, 6};
    int[] testArray1Sorted = {2, 3, 4, 5, 6};
    assertArrayEquals(testArray1Sorted, QuickSort.quickSort(testArray1));

    int[] testArray2 = {};
    int[] testArray2Sorted = {};
    assertArrayEquals(testArray2Sorted, QuickSort.quickSort(testArray2));

    int[] testArray3 = {1000};
    int[] testArray3Sorted = {1000};
    assertArrayEquals(testArray3Sorted, QuickSort.quickSort(testArray3));

    int[] testArray4 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    int[] testArray4Sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    assertArrayEquals(testArray4Sorted, QuickSort.quickSort(testArray4));
  }

  @Test
  public void testPartition() {
    int[] testArray1 = {3, 9, 1, 5};
    assertEquals(2, QuickSort.partition(testArray1, 0, testArray1.length - 1));
    int[] testArray2 = {3};
    assertEquals(0, QuickSort.partition(testArray2, 0, testArray2.length - 1));
    int[] testArray3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    assertEquals(0, QuickSort.partition(testArray3, 0, testArray3.length - 1));
    int[] testArray4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    assertEquals(8, QuickSort.partition(testArray4, 0, testArray4.length - 1));
  }

  @Test
  public void testSwap() {
    int[] testArray1 = {1, 2, 3, 4};
    int[] testArray1Swap4And1 = {4, 2, 3, 1};
    QuickSort.swap(testArray1, 3, 0);
    assertArrayEquals(testArray1Swap4And1, testArray1);

    int[] testArray2 = {-9, 03, 100, 9, 3, 2};
    int[] testArray2Swap100And9 = {-9, 03, 9, 100, 3, 2};
    QuickSort.swap(testArray2, 2, 3);
    assertArrayEquals(testArray2Swap100And9, testArray2);

    int[] testArray3 = {5};
    int[] testArray3Swap5And5 = {5};
    QuickSort.swap(testArray3, 0, 0);
    assertArrayEquals(testArray3Swap5And5, testArray3);
  }
}
