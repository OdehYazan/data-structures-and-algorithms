/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sort;

import java.util.Arrays;

public class App {
  public static String getGreeting() {
    return "GOOOOOOOOOOOD MORNING VIETNAM !!! ";
  }

  public static void main(String[] args) {
       MergeSort mergeSort=new MergeSort();

    int[] firstArray = {8, 4, 23, 42, 16, 15};

    System.out.println("**********************************************************\n");
    System.out.println(getGreeting()+"\n");
    System.out.println("**********************************************************");

    System.out.println(Arrays.toString(insertionSort(firstArray)));

    System.out.println(Arrays.toString(MergeSort.mergeSort(firstArray)));

  }

  public static int[] insertionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int j = i - 1;
      int temp = arr[i];
      while (j >= 0 && temp < arr[j]) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = temp;
    }
    return arr;
  }
}
