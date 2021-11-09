package hastable;

import org.junit.jupiter.api.Test;
import tree.BinaryTree;
import tree.TreeIntersection;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class HashtableTest {

  @Test
  public void testAdd() {
   HashTable<String> hashTable = new HashTable<>();
    hashTable.add("a", "Bucket 7");
    hashTable.add("b", "Bucket 8");
    hashTable.add("c", "Bucket 9");


    assertEquals("Bucket 7", hashTable.table[7].head.value);
    assertEquals("Bucket 8", hashTable.table[8].head.value);
    assertEquals("Bucket 9", hashTable.table[9].head.value);


    // COLLISIONS
    hashTable.add("k", "Also bucket 7");
    hashTable.add("l", "Also bucket 8");
    hashTable.add("m", "Also bucket 9");
    hashTable.add("u", "Also bucket 7 again");
    assertEquals("Also bucket 7", hashTable.table[7].head.next.value);
    assertEquals("Also bucket 8", hashTable.table[8].head.next.value);
    assertEquals("Also bucket 9", hashTable.table[9].head.next.value);
    assertEquals("Also bucket 7 again", hashTable.table[7].head.next.next.value);

    assertEquals("Bucket 7", hashTable.table[7].head.value);
    assertEquals("Bucket 8", hashTable.table[8].head.value);
    assertEquals("Bucket 9", hashTable.table[9].head.value);
  }

  @Test
  public void testFind() {
    HashTable<String> hashTable = new HashTable<>();
    hashTable.add("a", "Bucket 7");
    hashTable.add("b", "Bucket 8");
    hashTable.add("c", "Bucket 9");


    assertEquals("Bucket 7", hashTable.find("a"));
    assertEquals("Bucket 8", hashTable.find("b"));
    assertEquals("Bucket 9", hashTable.find("c"));


    hashTable.add("k", "Also bucket 7");
    hashTable.add("l", "Also bucket 8");
    hashTable.add("m", "Also bucket 9");
    hashTable.add("u", "Also bucket 7 again");
    assertEquals("Also bucket 7", hashTable.find("k"));
    assertEquals("Also bucket 8", hashTable.find("l"));
    assertEquals("Also bucket 9", hashTable.find("m"));
    assertEquals("Also bucket 7 again", hashTable.find("u"));
  }

  @Test
  public void testContains() {
    HashTable<String> hashTable = new HashTable<>();
    hashTable.add("a", "Bucket 7");
    hashTable.add("b", "Bucket 8");
    hashTable.add("c", "Bucket 9");


    assertTrue(hashTable.contains("a"));
    assertTrue(hashTable.contains("b"));
    assertTrue(hashTable.contains("c"));



    hashTable.add("d", "Also bucket 7");
    hashTable.add("e", "Also bucket 8");
    hashTable.add("f", "Also bucket 9");

    assertTrue(hashTable.contains("d"));
    assertTrue(hashTable.contains("e"));
    assertTrue(hashTable.contains("f"));


  }

  @Test
  public void testGetHash() {
    HashTable<String> hashTable = new HashTable<>();

    assertEquals(7, hashTable.getHash("a"));
    assertEquals(8, hashTable.getHash("b"));
    assertEquals(9, hashTable.getHash("c"));

  }
  @Test
  public void testFindRepeat() {
    HashTable<String> hashTable = new HashTable<>();
    String testString1 = "Once upon a time, there was a brave princess who...";
    String testString2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";

    assertEquals("a", hashTable.repeatedWord(testString1));
    assertEquals("it", hashTable.repeatedWord(testString2));

  }
  @Test
  void testTreeIntersection() {
    BinaryTree<Integer> binaryTreeOne = new BinaryTree<>(new TreeNode<>(5));
    TreeNode<Integer> node1 = new TreeNode<>(2);
    TreeNode<Integer> node2 = new TreeNode<>(3);
    TreeNode<Integer> node3 = new TreeNode<>(1, node1, node2);
    TreeNode<Integer> node5 = new TreeNode<>(6);
    TreeNode<Integer> node4 = new TreeNode<>(4, node5, null);
    binaryTreeOne.root.rightChild = node4;
    binaryTreeOne.root.leftChild = node3;

    BinaryTree<Integer> binaryTreeTwo = new BinaryTree<>(new TreeNode<>(45));
    TreeNode<Integer> node6 = new TreeNode<>(2);
    TreeNode<Integer> node7 = new TreeNode<>(12);
    TreeNode<Integer> node8 = new TreeNode<>(1, node6, node7);
    TreeNode<Integer> node9 = new TreeNode<>(44);
    TreeNode<Integer> node10 = new TreeNode<>(4, node9, null);
    binaryTreeTwo.root.rightChild = node10;
    binaryTreeTwo.root.leftChild = node8;


    assertEquals("[1, 2, 4]", TreeIntersection.treeIntersection(binaryTreeOne, binaryTreeTwo).toString());
  }
  @Test
  public void testLeftJoin() {
    HashMap<String, String> h1 = new HashMap<>();
    h1.put("fond", "enamored");
    h1.put("wrath", "anger");
    h1.put("diligent", "employed");
    h1.put("outfit", "garb");
    h1.put("guide", "usher");

    HashMap<String, String> h2 = new HashMap<>();
    h2.put("fond", "averse");
    h2.put("wrath", "delight");
    h2.put("diligent", "idle");
    h2.put("guide", "follow");
    h2.put("flow", "jam");

    String[] a = {"enamored", "averse"};
    String[] a1 = {"anger", "delight"};
    String[] a2 = {"employed", "idle"};
    String[] a3 = {"garb", null};
    String[] a4 = {"usher", "follow"};

    HashMap<String, String[]> h3 = new HashMap<>();

    h3 = LeftJoin.leftJoin(h1, h2);
    assertEquals(5, h3.size());
    assertFalse(h3.containsKey("flow"));
    assertArrayEquals(a, h3.get("fond"));
    assertArrayEquals(a1, h3.get("wrath"));
    assertArrayEquals(a2, h3.get("diligent"));
    assertArrayEquals(a3, h3.get("outfit"));
    assertArrayEquals(a4, h3.get("guide"));
  }
}
