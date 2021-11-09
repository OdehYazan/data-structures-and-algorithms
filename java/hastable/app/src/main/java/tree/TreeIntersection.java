package tree;



import java.util.*;

public class TreeIntersection<V> {

  public static ArrayList treeIntersection(BinaryTree tree1, BinaryTree tree2) {
    if (tree1.root == null || tree2.root == null) return null;
    Map<String,String> dataMap = new HashMap();
    ArrayList<Object> arr = new ArrayList<>();
    for (Object item : tree1.preOrder(tree1.root)) {
      dataMap.put(item.toString(), null);
    }
    for (Object oneItem: tree2.preOrder(tree2.root)) {
      if (dataMap.containsKey(oneItem.toString()) && !arr.contains(oneItem)) arr.add(oneItem);
    }
    return arr;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
