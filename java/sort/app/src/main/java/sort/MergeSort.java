package sort;

public class MergeSort {
  public static int[] mergeSort(int[] arr) {
    if (arr.length < 2) {
      return arr;
    }
    int middle = (int) Math.ceil(arr.length/2);
    int[] leftHalf = new int[middle];
    int[] rightHalf = new int[arr.length - middle];


//System.arraycopy(arr, 0, leftHalf, 0, leftHalf.length);
    for (int i = 0; i < leftHalf.length; i++) {
      leftHalf[i] = arr[i];
    }

//System.arraycopy(arr, middle, rightHalf, 0, rightHalf.length);
    for (int i = 0; i < rightHalf.length; i++) {
      rightHalf[i] = arr[middle + i];
    }
    return merge(mergeSort(leftHalf), mergeSort(rightHalf));
  }

  public static int[] merge(int[] leftHalf, int[] rightHalf) {
    int[] merged = new int[leftHalf.length + rightHalf.length];


    int i = 0;
    int j = 0;
    int k = 0;


    while (i < leftHalf.length && j < rightHalf.length) {
      if (leftHalf[i] <= rightHalf[j]) {
        merged[k] = leftHalf[i];
        k++;
        i++;
      } else {
        merged[k] = rightHalf[j];
        k++;
        j++;
      }

    }


    while(i < leftHalf.length) {
      merged[k] = leftHalf[i];
      k++;
      i++;
    }


    while(j < rightHalf.length) {
      merged[k] = rightHalf[j];
      k++;
      j++;
    }
    return merged;
  }
}
