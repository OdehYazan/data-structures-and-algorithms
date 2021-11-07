package hastable;

import org.junit.jupiter.api.Test;
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
}
