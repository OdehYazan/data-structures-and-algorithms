
import data.BTNode;
import structure.BinaryTree;

public class Main {
  public static void main(String[] args) {

    BinaryTree binaryTree= new BinaryTree();
    binaryTree.setRoot(new BTNode("Y"));
    binaryTree.getRoot().setLeft(new BTNode("A"));
    binaryTree.getRoot().setRight(new BTNode("Z"));
    binaryTree.getRoot().getLeft().setLeft(new BTNode("A"));
    binaryTree.getRoot().getLeft().setRight(new BTNode("N"));

    binaryTree.bfs();


  }


}
