package tree;

public class TreeNode<V> {
  public String key;
  public V value;
  public TreeNode next;
  public TreeNode leftChild;
  public TreeNode rightChild;

  public TreeNode(String key, V value) {
    this.key = key;
    this.value = value;
  }

  public TreeNode() {}

  public TreeNode(V value) {
    this.value = value;
  }

  public TreeNode(V value, TreeNode leftChild, TreeNode rightChild) {
    this.value = value;
    this.leftChild = leftChild;
    this.rightChild = rightChild;
  }
}
