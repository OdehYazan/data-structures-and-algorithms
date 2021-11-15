package tree;
import java.util.ArrayList;

public class BinaryTree<V> {

  public ArrayList<V> preOrderList = new ArrayList<>();
  public TreeNode<V> root;

  public BinaryTree() {}

  public BinaryTree(TreeNode<V> root) {
    this.root = root;
  }

  public ArrayList<V> preOrder(TreeNode<V> root) {
    try {
      preOrderList.add(root.value);
      if (root.leftChild != null) preOrder(root.leftChild);
      if (root.rightChild != null) preOrder(root.rightChild);
    } catch (NullPointerException exception) {
      System.out.println(exception.getMessage());
    }
    return preOrderList;
  }

  @Override
  public String toString() {
    if (preOrderList.isEmpty()) return "Empty List";
    return "preOrderList=" + preOrderList;
  }
}
