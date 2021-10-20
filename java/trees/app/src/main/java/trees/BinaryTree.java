package trees;

import queue.data.QueueNode;
import queue.queue.Queue;

public class BinaryTree<T extends Comparable<T>> extends BinarySearchTree {


  @Override
  public Node getRoot() {
    return super.getRoot();
  }

  public void inorderTraversal() {
    if (isEmpty()) {
      return;
    }

    traverseInorder(getRoot());
  }

  private void traverseInorder(Node<T> root) {
    if (root.getLeftNode() != null) { // traverse left
      traverseInorder(root.getLeftNode());
    }

    // visit / print the root of the tree (root could be a sub-tree)
    System.out.print(root.getData() + " -> ");

    if (root.getRightNode() != null) { // traverse right
      traverseInorder(root.getRightNode());
    }
  }


  public void preorderTraversal() {
    if (isEmpty()) {
      return;
    }

    preOrder(getRoot());
  }

  public void preOrder(Node<T> node) {
    if (node == null) {
      return;
    }

    System.out.printf(node.getData() + " -> ");
    preOrder(node.getLeftNode());
    preOrder(node.getRightNode());
  }

  public void postorderTraversal() {
    if (isEmpty()) {
      return;
    }

    postOrder(getRoot());
  }

  public void postOrder(Node<T> node) {
    if (node == null) {
      return;
    }


    postOrder(node.getLeftNode());
    postOrder(node.getRightNode());
    System.out.printf(node.getData() + " -> ");
  }


//  public void breadthFirst() {
//    if (isEmpty()) {
//      return;
//    }
//
//    breadth(getRoot());
//  }
//
//  public void breadth(Node<T> node) {
//    if (node == null) {
//      return;
//    }
//    System.out.printf(node.getData() + " -> ");
//
//    if (node.getLeftNode() != null) {
//      System.out.println(node.getLeftNode().getData()+ " -> ");
//    }
//
//    if (node.getRightNode() != null) {
//      System.out.println(node.getRightNode().getData()+ " -> ");
//    }
//
//  }
//public void breadth() {
//  if (isEmpty()) {
//    return;
//  }
//
//  breadthFirst(getRoot());
//}


}
