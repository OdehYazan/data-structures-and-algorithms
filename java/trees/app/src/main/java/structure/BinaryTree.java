package structure;

import data.BTNode;




public class BinaryTree<T> {

  private BTNode root;

  public BTNode getRoot() {
    return root;
  }

  public void setRoot(BTNode root) {
    this.root = root;
  }

  public void bfs() {
    if (root != null) {
      Queue<BTNode> queue = new Queue<>();
      queue.enqueue(root);

      BTNode node;
      while (!queue.isEmpty()) {
        node = queue.dequeue();

        System.out.print(node.getData() + " ");


        if (node.getLeft() != null) {

          queue.enqueue(node.getLeft());
        }

        if (node.getRight() != null) {
          queue.enqueue(node.getRight());
        }

      }
    } else {
      System.out.println("Tree empty");
    }

  }


}
