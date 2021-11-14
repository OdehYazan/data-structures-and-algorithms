package sort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {
  @Test
  public void testMergeSort() {
    int[] testArray1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] testArray1Sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    assertArrayEquals(testArray1Sorted, MergeSort.mergeSort(testArray1));

    int[] testArray2 = {};
    int[] testArray2Sorted = {};
    assertArrayEquals(testArray2Sorted, MergeSort.mergeSort(testArray2));

    int[] testArray3 = {-45};
    int[] testArray3Sorted = {-45};
    assertArrayEquals(testArray3Sorted, MergeSort.mergeSort(testArray3));

    int[] testArray4 = {0, 45, 7, -124, 54, 299432, 1};
    int[] testArray4Sorted = {-124, 0, 1, 7, 45, 54, 299432};
    assertArrayEquals(testArray4Sorted, MergeSort.mergeSort(testArray4));
  }

  @Test
  public void testMerge() {
    int[] testArray1 = {1, 3, 5};
    int[] testArray2 = {2, 4, 6};
    int[] mergeArray1And2 = {1, 2, 3, 4, 5, 6};
    assertArrayEquals(mergeArray1And2, MergeSort.merge(testArray1, testArray2));

    int[] testArray3 = {};
    int[] testArray4 = {};
    int[] mergeArray3And4 = {};
    assertArrayEquals(mergeArray3And4, MergeSort.merge(testArray3, testArray4));

    int[] testArray5 = {1000, -33, 4, 12, 9, 452, 90};
    int[] testArray6 = {7};
    int[] mergeArray5And6 = {7, 1000, -33, 4, 12, 9, 452, 90};
    assertArrayEquals(mergeArray5And6, MergeSort.merge(testArray5, testArray6));

    int[] testArray7 = {1, 72};
    int[] testArray8 = {-6, 29, 528, 64};
    int[] mergeArray7And8 = {-6, 1, 29, 72, 528, 64};
    assertArrayEquals(mergeArray7And8, MergeSort.merge(testArray7, testArray8));
  }
}
