package sort;

public class QuickSort {

  public static int[] quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
    return arr;
  }

  protected static void quickSort(int arr[], int start, int end) {
    if (start < end) {
      int partitionIndex = partition(arr, start, end);
      quickSort(arr, start, partitionIndex - 1);
      quickSort(arr, partitionIndex + 1, end);
    }
  }

  protected static int partition(int arr[], int start, int end) {
    int pivot = arr[end];
    int i = (start - 1);

    for (int j = start; j < end; j++) {
      if (arr[j] <= pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, end);
    return i + 1;
  }

  protected static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
