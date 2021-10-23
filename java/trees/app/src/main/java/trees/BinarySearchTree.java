package trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> {

  private Node<T> root;
  private Node<Integer> root1;
  private Node<T> leftNode;
  private Node<T> rightNode;

  public Node<T> getRoot() {
    return root;
  }

  public void insert(T data) {
    if (isEmpty()) { // tree empty
      root = new Node<>(data);
    } else {
      insertHelper(data, root);
    }
  }

  private void insertHelper(T data, Node<T> root) {
    Node<T> node = new Node<>(data);
    if (data.compareTo(root.getData()) < 0) {
      if (root.getLeftNode() == null) {
        root.setLeftNode(node);
      } else {
        insertHelper(data, root.getLeftNode());
      }
    } else if (data.compareTo(root.getData()) > 0) {
      if (root.getRightNode() == null) {
        root.setRightNode(node);
      } else {
        insertHelper(data, root.getRightNode());
      }
    }
  }

  public boolean contains(T data) {
    return contains(data, root);
  }

  private boolean contains(T data, Node<T> node) {
    if (node == null)
      return false;
    int searchResult = data.compareTo(node.getData());
    if (searchResult < 0)
      return contains(data, node.getLeftNode());
    else if (searchResult > 0)
      return contains(data, node.getRightNode());
    else
      return true; // Match
  }


  public void oddSum() {
    if (isEmpty()) {
      return;
    }

//    oddSumHelper((Node<Integer>) root);

    System.out.println(oddSumHelper((Node<Integer>) root));
  }

//  int sum = 0;

//  private void oddSumHelper(Node<Integer> root) {
//
//
//    if (root.getLeftNode() != null) { // traverse left
//      if ((root.getLeftNode().getData()) % 2 != 0) {
//        sum += (int) (root.getLeftNode().getData());
//      }
//      oddSumHelper(root.getLeftNode());
//    }
//
//
//    if (root.getRightNode() != null) {
//      if ((root.getRightNode().getData()) % 2 != 0) {
//        sum += (root.getRightNode().getData());
//      }// traverse right
//      oddSumHelper(root.getRightNode());
//    }
public int oddSumHelper(Node<Integer> node) {
  int sum = 0;
  if (node != null) {
    if (node.getData() % 2 != 0) {
      sum += node.getData();
    }
    sum += oddSumHelper(node.getLeftNode());
    sum += oddSumHelper(node.getRightNode());
  }
  return sum;

  }










  public boolean isEmpty() {
    return root == null;
  }
}
