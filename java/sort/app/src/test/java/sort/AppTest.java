/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testInsertionSort() {
      int[] testArray1 = {4,3,1,8,5,7,2};
      int[] testArray2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
      int[] testArray3 = {};
      int[] testArray4 = {100, -3, 5, -42, 66};

      int[] result1 = {1, 2, 3, 4, 5, 7, 8};
      int[] result2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int[] result3 = {};
      int[] result4 = {-42, -3, 5, 66, 100};


      assertArrayEquals(result1, App.insertionSort(testArray1));
      assertArrayEquals(result2, App.insertionSort(testArray2));
      assertArrayEquals(result3, App.insertionSort(testArray3));
      assertArrayEquals(result4, App.insertionSort(testArray4));
    }
    }

