# Insertion Sort



## Pseudocode

```java
 ALGORITHM Mergesort(arr)
  DECLARE n <-- arr.length

  if n > 1
  DECLARE mid <-- n/2
  DECLARE left <-- arr[0...mid]
  DECLARE right <-- arr[mid...n]
  // sort the left side
  Mergesort(left)
  // sort the right side
  Mergesort(right)
  // merge the sorted left and right sides together
  Merge(left, right, arr)

  ALGORITHM Merge(left, right, arr)
  DECLARE i <-- 0
  DECLARE j <-- 0
  DECLARE k <-- 0

  while i < left.length && j < right.length
  if left[i] <= right[j]
  arr[k] <-- left[i]
  i <-- i + 1
  else
  arr[k] <-- right[j]
  j <-- j + 1

  k <-- k + 1

  if i = left.length
  set remaining entries in arr to remaining values in right
  else
  set remaining entries in arr to remaining values in left
```

## Trace
![trace](https://cdn.programiz.com/cdn/farfuture/PRTu8e23Uz212XPrrzN_uqXkVZVY_E0Ta8GZp61-zvw/mtime:1586425911/sites/tutorial2program/files/merge-sort-example_0.png)

[trace](https://www.youtube.com/watch?v=iMT7gTPpaqw)
## Efficiency

- **Time: `log(n)`:**

  Time complexity of Merge Sort is `log(n)` as merge sort always divides the array into two halves and takes linear time to merge two halves.

- **Space: `O(n)`:**

  additional space is being created. two new arrays the space at constant `O(n)`.
