
import data.FzBzNode;
import structure.FizzBuzzTree;

public class Main {
  public static void main(String[] args) {



//    BinaryTree binaryTree= new BinaryTree();
//    binaryTree.setRoot(new BTNode("Y"));
//    binaryTree.getRoot().setLeft(new BTNode("A"));
//    binaryTree.getRoot().setRight(new BTNode("Z"));
//    binaryTree.getRoot().getLeft().setLeft(new BTNode("A"));
//    binaryTree.getRoot().getLeft().setRight(new BTNode("N"));
//
//    binaryTree.bfs();

   FizzBuzzTree fizzBuzz = new FizzBuzzTree();
    FzBzNode root = new FzBzNode("2");
    FzBzNode node1 = new FzBzNode("15");
    FzBzNode node2 = new FzBzNode("5");
    FzBzNode node3 = new FzBzNode("8");
    FzBzNode node4 = new FzBzNode("7");
    FzBzNode node5 = new FzBzNode("99");
    FzBzNode node6 = new FzBzNode("10");

    fizzBuzz.root = root;
    root.subNode.add(node1);
    root.subNode.add(node2);
    node1.subNode.add(node3);
    node2.subNode.add(node4);
    node2.subNode.add(node5);
    node2.subNode.add(node6);
    System.out.println(fizzBuzz.fizzBuzz(root));


  }


}
