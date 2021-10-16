package trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> {

  private Node<T> root;
  private Node<T> leftNode;
  private Node<T> rightNode;

  public void insert(T data) {
    if (isEmpty()) { // tree empty
      root = new Node<>(data);
    } else {
      insertHelper(data, root);
    }
  }

  public void inorderTraversal() {
    if (isEmpty()) {
      return;
    }

    traverseInorder(root);
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

    preOrder(root);
  }
  public void preOrder( Node<T> node) {
    if (node == null) {
      return;
    }

    System.out.printf( node.getData() +" -> ");
    preOrder(node.getLeftNode());
    preOrder(node.getRightNode());
  }


  public void postorderTraversal() {
    if (isEmpty()) {
      return;
    }

    postOrder(root);
  }
  public void postOrder( Node<T> node) {
    if (node == null) {
      return;
    }


    preOrder(node.getLeftNode());
    preOrder(node.getRightNode());
    System.out.printf( node.getData() +" -> ");
  }

  public boolean contains( T data )
  {
    return contains( data, root );
  }

  private boolean contains( T data, Node<T> node )
  {
    if( node == null )
      return false;
    int searchResult = data.compareTo( node.getData() );
    if( searchResult < 0 )
      return contains( data, node.getLeftNode() );
    else if( searchResult > 0 )
      return contains( data, node.getRightNode() );
    else
      return true; // Match
  }



  private void insertHelper(T data, Node<T> root) {
    Node<T> node = new Node<>(data);
    if (data.compareTo(root.getData()) < 0) {
      if (root.getLeftNode() == null) {
        root.setLeftNode(node);
      } else {
        insertHelper(data, root.getLeftNode());
      }
    } else if(data.compareTo(root.getData()) > 0) {
      if (root.getRightNode() == null) {
        root.setRightNode(node);
      } else {
        insertHelper(data, root.getRightNode());
      }
    }
  }





  public boolean isEmpty() {
    return root == null;
  }
}
